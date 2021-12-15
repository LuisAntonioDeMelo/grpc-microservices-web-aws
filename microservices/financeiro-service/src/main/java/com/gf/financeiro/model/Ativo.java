package com.gf.financeiro.model;

import com.gf.financeiro.model.shared.Cliente;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "ativo")
public class Ativo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codigo;
    private Double quantidade;
    private String nome;
    private Double valorMoeda;
    private Double valorFracionado;

    @ManyToOne
    private ExtratoAtivo extratoAtivo;

    @ManyToOne
    private Cliente cliente;
}

