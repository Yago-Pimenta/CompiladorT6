package br.ufscar.dc.compiladores.cooklang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import br.ufscar.dc.compiladores.cooklang.SemanticException;
import br.ufscar.dc.compiladores.cooklang.SyntaxErrorListener;
import br.ufscar.dc.compiladores.cooklang.SyntaxException;
/**
 * Classe principal do compilador CookLang.
 * Orquestra as fases: análise léxica, sintática, semântica e geração de HTML.
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Uso: java -jar cooklang.jar <arquivo.rec>");
            System.exit(1);
        }

        // 1) Leitura das linhas do arquivo para contexto de erro
        List<String> sourceLines = Files.readAllLines(Paths.get(args[0]));

        // 2) Leitura do stream de caracteres
        CharStream input = CharStreams.fromFileName(args[0]);

        // 3) Análise léxica com captura de erros léxicos
        CookLangLexer lexer = new CookLangLexer(input);
        SyntaxErrorListener syntaxListener = new SyntaxErrorListener(sourceLines);
        lexer.removeErrorListeners();
        lexer.addErrorListener(syntaxListener);

        // 4) Análise sintática com captura de erros sintáticos
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CookLangParser parser = new CookLangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(syntaxListener);

        // 5) Parse inicial
        ParseTree tree = parser.receita();

        // 6) Verifica se houve erros léxicos/sintáticos
        if (syntaxListener.hasErrors()) {
            syntaxListener.printErrors();
            System.exit(1);
        }

        // 7) Análise semântica
        try {
          
            AnalisadorSemantico analisador = new AnalisadorSemantico();
            analisador.valida(tree);
        } catch (SemanticException e) {
            System.err.println("[ERRO SEMÂNTICO] Foram encontrados os seguintes problemas:");
            for (String msg : e.getErros()) {
                System.err.println(" - " + msg);
            }
            System.exit(1); // termina com erro
        }

        // 8) Geração de HTML
        GeradorHTML gerador = new GeradorHTML();
        String html = gerador.visit(tree);
        System.out.println(html);
    }
}
