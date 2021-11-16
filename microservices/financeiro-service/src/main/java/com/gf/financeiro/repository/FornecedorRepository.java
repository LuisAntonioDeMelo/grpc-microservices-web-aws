package com.gf.financeiro.repository;

import com.gf.financeiro.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor,Long> {
}
