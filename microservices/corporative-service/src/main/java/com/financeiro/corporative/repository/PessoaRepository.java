package com.financeiro.corporative.repository;

import com.financeiro.corporative.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
