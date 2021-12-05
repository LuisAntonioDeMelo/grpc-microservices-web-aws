package com.financeiro.corporative.repository;

import com.financeiro.corporative.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.OptionalInt;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query("select c from Cliente c " +
            "inner join c.pessoa p " +
            "where p.id = :id ")
    public Optional<Cliente> obterPorId(@Param("id") Long id);
}
