package com.financeiro.corporative.repository;

import com.financeiro.corporative.model.ContaCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContaClienteRepository extends JpaRepository<ContaCliente,Long> {

    //List<ContaCliente> findAllByContaClientesByClienteId(Long id);
    @Query("select cc from ContaCliente cc " +
            "inner join cc.cliente cli " +
            "where cli.id = :id ")
    List<ContaCliente> obterContasPorIdCliente(@Param("id") Long id);
}
