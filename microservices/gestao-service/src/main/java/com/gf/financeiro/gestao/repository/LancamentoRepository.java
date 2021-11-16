package com.gf.financeiro.gestao.repository;

import com.gf.financeiro.gestao.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento,Long> {
}
