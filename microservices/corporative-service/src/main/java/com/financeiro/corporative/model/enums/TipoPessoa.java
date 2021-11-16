package com.financeiro.corporative.model.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoPessoa {

    CPF(1,"cpf"),
    CNPJ(2, "cnpj");

    private Integer codigo;
    private String valor;

}
