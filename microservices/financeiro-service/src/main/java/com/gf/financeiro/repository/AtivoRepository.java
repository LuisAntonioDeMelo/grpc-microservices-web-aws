package com.gf.financeiro.repository;

import com.gf.financeiro.model.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AtivoRepository extends JpaRepository<Ativo, Long> {
    @Query("select a from Ativo a " +
            "inner join a.cliente cli " +
            "where cli.id = :id")
    List<Ativo> findAllByIdCliente(@Param("id") Long idCliente);
}
