package com.financeiro.corporative.model.enums;

public enum TipoConta {
    CORRENTE(1, "conta corrente"),
    POUPANCA(2, "conta poupança");

    TipoConta(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    private Integer codigo;
    private String descricao;
}
