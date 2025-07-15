package br.ufscar.dc.compiladores.cooklang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Listener para coletar e refinar erros de análise léxica e sintática.
 */
public class SyntaxErrorListener extends BaseErrorListener {
    private final List<String> errors = new ArrayList<>();
    private final List<String> sourceLines;

    /**
     * @param sourceLines linhas do arquivo de entrada (1-based)
     */
    public SyntaxErrorListener(List<String> sourceLines) {
        this.sourceLines = sourceLines != null ? sourceLines : Collections.emptyList();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        // Classifica o tipo de erro
        String kind = msg.startsWith("token recognition error") ? "[LÉXICO]" : "[SINTÁTICO]";
        // Recupera o contexto da linha
        String textLine = (line > 0 && line <= sourceLines.size()) ? sourceLines.get(line - 1) : "";
        // Cria um ponteiro para a posição do erro
        String pointer = charPositionInLine >= 0
            ? String.join("", Collections.nCopies(charPositionInLine, " ")) + "^"
            : "";
        // Formata mensagem completa
        String fullMsg = String.format(
            "%s Linha %d:%d: %s%n  %s%n  %s",
            kind, line, charPositionInLine, msg, textLine, pointer
        );
        errors.add(fullMsg);
    }

    /**
     * @return true se houver pelo menos um erro
     */
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    /**
     * Retorna a lista de erros coletados
     */
    public List<String> getErrors() {
        return errors;
    }

    /**
     * Imprime os erros coletados no stderr
     */
    public void printErrors() {
        errors.forEach(System.err::println);
    }
}
