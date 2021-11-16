package com.gf.financeiro.gestao.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
public enum TipoLancamento {

    DESPESA(1,"despesa"),
    RECEITA(2,"receita");

    @Getter
    private final Integer codigo;
    private final String descricao;

    public static final TipoLancamento getByValue(Integer value){
        return Arrays.stream(TipoLancamento.values()).filter(e -> e.codigo.equals(value)).findFirst().orElse(null);
    }

}
