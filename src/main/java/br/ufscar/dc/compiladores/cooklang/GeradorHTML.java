package br.ufscar.dc.compiladores.cooklang;

import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Visitor para geração de HTML a partir da árvore de Parse de CookLang.
 */
public class GeradorHTML extends CookLangBaseVisitor<String> {

    @Override
    public String visitReceita(CookLangParser.ReceitaContext ctx) {
        StringBuilder sb = new StringBuilder();
        // Título da receita
        String title = ctx.title().WORD().stream()
                            .map(TerminalNode::getText)
                            .collect(Collectors.joining(" ")).trim();

        // Cabeçalho HTML com link para style.css
        sb.append("<!DOCTYPE html>\n<html>\n<head>\n");
        sb.append("  <meta charset=\"UTF-8\">\n");
        sb.append("  <title>").append(escapeHTML(title)).append("</title>\n");
        sb.append("  <link rel=\"stylesheet\" href=\"style.css\">\n");
        sb.append("</head>\n<body>\n");

        // Cabeçalho da página
        sb.append("  <h1>").append(escapeHTML(title)).append("</h1>\n");

        // Lista de ingredientes
        sb.append("  <h2>Ingredientes</h2>\n<ul>\n");
        for (CookLangParser.IngredienteContext ing : ctx.ingrediente()) {
            String quantidade = ing.NUMBER().getText();
            String unidade = ing.UNIT().getText();
            String descricao = ing.WORD().stream()
                                  .map(TerminalNode::getText)
                                  .collect(Collectors.joining(" ")).trim();
            sb.append("    <li>")
              .append(escapeHTML(quantidade + " " + unidade + " " + descricao))
              .append("</li>\n");
        }
        sb.append("</ul>\n");

        // Lista de passos
        sb.append("  <h2>Modo de Preparo</h2>\n<ol>\n");
        for (CookLangParser.PassoContext passo : ctx.passo()) {
            String texto = passo.WORD().stream()
                                .map(TerminalNode::getText)
                                .collect(Collectors.joining(" ")).trim();
            String tempoKw = passo.TEMPO_KW().getText();
            String tempo = passo.TEMPO().getText();
            String item = texto + " " + tempoKw + " " + tempo;
            sb.append("    <li>")
              .append(escapeHTML(item))
              .append("</li>\n");
        }
        sb.append("</ol>\n");

        sb.append("</body>\n</html>\n");
        return sb.toString();
    }

    /**
     * Escapa caracteres especiais para HTML.
     */
    private String escapeHTML(String text) {
        if (text == null) return "";
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;");
    }
}