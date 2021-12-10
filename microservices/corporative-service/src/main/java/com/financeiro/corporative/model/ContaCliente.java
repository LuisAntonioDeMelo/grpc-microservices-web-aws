package com.financeiro.corporative.model;

import com.financeiro.corporative.model.enums.TipoConta;
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
@Table(name="conta_cliente")
public class ContaCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private Integer banco;
    private String numeroConta;
    private Double saldo;
    private String digito;
    private Double debitoPedente;
    private TipoConta conta;
}
