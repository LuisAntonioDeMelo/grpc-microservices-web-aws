package com.gf.financeiro.repository;

import com.gf.financeiro.model.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcamentoRepository extends JpaRepository<Orcamento,Long> {
}
