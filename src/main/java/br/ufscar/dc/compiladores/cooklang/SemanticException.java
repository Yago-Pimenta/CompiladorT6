package br.ufscar.dc.compiladores.cooklang;

import java.util.List;

public class SemanticException extends RuntimeException {
    private final List<String> erros;

    public SemanticException(List<String> erros) {
        super("Erros semânticos encontrados");
        this.erros = erros;
    }

    public List<String> getErros() {
        return erros;
    }
}
