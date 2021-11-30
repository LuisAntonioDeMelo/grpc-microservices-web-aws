package com.gf.financeiro.gestao.repository;

import com.gf.financeiro.gestao.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
