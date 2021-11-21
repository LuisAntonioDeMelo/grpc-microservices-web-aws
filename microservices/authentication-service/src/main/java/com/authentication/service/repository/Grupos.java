package com.authentication.service.repository;


import com.authentication.service.model.Grupo;
import com.authentication.service.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Grupos extends JpaRepository<Grupo, Long> {
	
	//List<Grupo> findByUsuariosIn(Usuario usuario);

}
