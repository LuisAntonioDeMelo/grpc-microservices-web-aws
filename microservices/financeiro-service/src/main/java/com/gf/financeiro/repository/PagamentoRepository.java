package com.gf.financeiro.repository;

import com.gf.financeiro.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {
}
