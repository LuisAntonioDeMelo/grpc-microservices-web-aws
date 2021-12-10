package com.financeiro.corporative.model.enums;

import lombok.Getter;

import java.util.Arrays;

public enum TipoConta {
    CORRENTE(1, "conta corrente"),
    POUPANCA(2, "conta poupança");

    TipoConta(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Getter
    private final Integer codigo;
    private final String descricao;

    public static final TipoConta getByValue(Integer value){
        return Arrays.stream(TipoConta.values()).filter(e -> e.codigo.equals(value)).findFirst().orElse(null);
    }


}
