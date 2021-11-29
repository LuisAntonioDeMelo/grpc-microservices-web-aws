package com.authentication.service.model;

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

    private String nome;

    private String cpfCpnj;

    private String rg;

    private String email;

    private String telefone;

    private Boolean ativo;

    public Pessoa(Long id) {
        this.id = id;
    }
}
