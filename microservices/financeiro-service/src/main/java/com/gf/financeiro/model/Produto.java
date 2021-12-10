package com.gf.financeiro.model;

import com.gf.financeiro.model.shared.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;
    private String modelo;
    private String unidade;

    @ManyToOne
    private ExtratoAtivo extratoAtivo;

    @ManyToOne
    private Cliente cliente;
}

