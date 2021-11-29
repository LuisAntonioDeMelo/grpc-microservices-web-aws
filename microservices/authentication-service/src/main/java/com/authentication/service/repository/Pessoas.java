package com.authentication.service.repository;

import com.authentication.service.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pessoas extends JpaRepository<Pessoa, Long> {
}
