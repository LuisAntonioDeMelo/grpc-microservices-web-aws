package com.financeiro.corporative.repository;

import com.financeiro.corporative.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

    @Override
    Optional<Pessoa> findById(Long aLong);

    @Query("SELECT p from Pessoa p where p.id = :id")
    Pessoa obterPorId(@Param("id") Long id);


}
