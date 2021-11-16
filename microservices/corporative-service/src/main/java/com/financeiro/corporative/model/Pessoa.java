package com.financeiro.corporative.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    private String cpfCpnj;

    private String rg;

    private String email;

    private String telefone;

    @Embedded
    private Endereco endereco;

    @NotNull
    private Boolean ativo;

    public Pessoa(Long id) {
        this.id = id;
    }
}
