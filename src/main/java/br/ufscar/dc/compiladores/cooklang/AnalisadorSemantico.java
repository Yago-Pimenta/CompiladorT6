package br.ufscar.dc.compiladores.cooklang;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Visitante para análise semântica, lançando SemanticException em caso de inconsistências.
 */
public class AnalisadorSemantico extends CookLangBaseVisitor<Void> {

    private final List<String> erros = new ArrayList<>();
    private int passoEsperado = 1;

    private void erro(ParserRuleContext ctx, String msg) {
        int linha = ctx.getStart().getLine();
        erros.add(String.format("[SEMÂNTICO] Linha %d: %s", linha, msg));
    }

    @Override
    public Void visitIngrediente(CookLangParser.IngredienteContext ctx) {
        // Extrai quantidade e unidade dos tokens
        int quantidade;
        try {
            quantidade = Integer.parseInt(ctx.NUMBER().getText());
            if (quantidade < 1) {
                erro(ctx, String.format("Quantidade deve ser >=1, encontrada: %d", quantidade));
            }
        } catch (NumberFormatException e) {
            erro(ctx, String.format("Quantidade inválida: '%s'", ctx.NUMBER().getText()));
            return super.visitIngrediente(ctx);
        }
        String un = ctx.UNIT().getText();
        // verifica unidade válida (já garantido pelo lexer, mas reforça semântica)
        // extrai descrição a partir dos TERM_NODEs WORD
        List<TerminalNode> words = ctx.WORD();
        if (words.isEmpty()) {
            erro(ctx, "Ingrediente sem descrição");
        }
        return super.visitIngrediente(ctx);
    }

    @Override
    public Void visitPasso(CookLangParser.PassoContext ctx) {
        // Número do passo
        int numero;
        try {
            numero = Integer.parseInt(ctx.NUMBER().getText());
            if (numero != passoEsperado) {
                erro(ctx, String.format("Passo %d inesperado (esperado: %d)", numero, passoEsperado));
                passoEsperado = numero + 1;
            } else {
                passoEsperado++;
            }
        } catch (NumberFormatException e) {
            erro(ctx, String.format("Número de passo inválido: '%s'", ctx.NUMBER().getText()));
            return super.visitPasso(ctx);
        }
        // Verifica texto do passo
        List<TerminalNode> words = ctx.WORD();
        if (words.isEmpty()) {
            erro(ctx, "Passo sem descrição");
        }
        // Tempo
        try {
            String tempoTxt = ctx.TEMPO().getText();
            // valor numérico
            int valor = Integer.parseInt(tempoTxt.replaceAll("(min|h)", ""));
            if (valor < 1) {
                erro(ctx, String.format("Duração inválida: '%s'", tempoTxt));
            }
        } catch (Exception e) {
            erro(ctx, String.format("Formato de duração inválido: '%s'", ctx.TEMPO().getText()));
        }
        return super.visitPasso(ctx);
    }

    /**
     * Valida a árvore; lança SemanticException se encontrar erros.
     */
    public void valida(ParseTree tree) throws SemanticException {
        visit(tree);
        if (!erros.isEmpty()) {
            throw new SemanticException(erros);
        }
    }
}
