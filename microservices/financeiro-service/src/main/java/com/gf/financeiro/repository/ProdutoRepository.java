package com.gf.financeiro.repository;

import com.gf.financeiro.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
