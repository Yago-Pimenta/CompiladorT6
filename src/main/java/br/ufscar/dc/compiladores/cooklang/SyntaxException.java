package br.ufscar.dc.compiladores.cooklang;

import java.util.List;

/**
 * Exceção lançada quando ocorrem erros de sintaxe.
 */
public class SyntaxException extends Exception {
    private final List<String> errors;

    public SyntaxException(List<String> errors) {
        super("Erros de sintaxe encontrados");
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
