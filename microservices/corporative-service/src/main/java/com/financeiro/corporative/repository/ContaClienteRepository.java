package com.financeiro.corporative.repository;

import com.financeiro.corporative.model.ContaCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContaClienteRepository extends JpaRepository<ContaCliente,Long> {

    List<ContaCliente> findAllByContaClientesByClienteId(Long id);
}
