package com.authentication.service.model;

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
    @Column(name ="pessoa_id")
    private Long id;

    @NotNull
    @Column(name ="pessoa_nome")
    private String nome;

    @Column(name ="pessoa_cpf")
    private String cpfCpnj;

    @Column(name="pessoa_rg")
    private String rg;

    @Column(name ="pessoa_email")
    private String email;

    @Column(name="pessoa_telefone")
    private String telefone;

//    @Embedded
//    private Endereco endereco;

    @NotNull
    private Boolean ativo;

    public Pessoa(Long id) {
        this.id = id;
    }
}
