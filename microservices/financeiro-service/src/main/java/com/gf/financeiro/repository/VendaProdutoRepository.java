package com.gf.financeiro.repository;

import com.gf.financeiro.model.VendaProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaProdutoRepository extends JpaRepository<VendaProduto,Long> {
}
