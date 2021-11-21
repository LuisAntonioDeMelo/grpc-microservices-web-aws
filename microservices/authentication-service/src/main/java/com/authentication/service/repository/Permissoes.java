package com.authentication.service.repository;


import com.authentication.service.model.Grupo;
import com.authentication.service.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Permissoes extends JpaRepository<Permissao, Long> {
	
	//List<Permissao> findByGruposIn(Grupo grupo);

}
