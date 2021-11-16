package com.gf.financeiro.model;

public enum TipoPagamento {
    A_PRAZO(1, "a prazo"), A_VISTA(2, "a vista");

    TipoPagamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    private Integer codigo;
    private String descricao;
}
