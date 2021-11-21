package com.authentication.service.repository;


import com.authentication.service.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuarios extends JpaRepository<Usuario, Long> {

	Usuario findByLogin(String login);
}
