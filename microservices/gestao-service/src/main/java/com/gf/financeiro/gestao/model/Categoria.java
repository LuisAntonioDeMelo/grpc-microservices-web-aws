package com.gf.financeiro.gestao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "nome")
    private String nome;

    public Categoria(long idCategoria) {
        this.codigo = idCategoria;
    }
}
