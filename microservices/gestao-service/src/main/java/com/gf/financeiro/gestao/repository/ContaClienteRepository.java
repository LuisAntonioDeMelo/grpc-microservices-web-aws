package com.gf.financeiro.gestao.repository;

import com.gf.financeiro.gestao.model.ContaCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaClienteRepository extends JpaRepository<ContaCliente,Long> {
}
