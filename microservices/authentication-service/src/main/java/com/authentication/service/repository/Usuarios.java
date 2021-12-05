package com.authentication.service.repository;


import com.authentication.service.model.Usuario;
import com.authentication.service.model.dto.UsuarioRestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Usuarios extends JpaRepository<Usuario, Long> {

	@Query("SELECT " +
			"new com.authentication.service.model.dto.UsuarioRestDTO(" +
			"u.id," +
			"p.id," +
			"p.nome," +
			"u.login," +
			"u.senha," +
			"p.email," +
			"p.ativo )" +
			"from Usuario u " +
			"inner join u.pessoa p " +
			"where u.login = :login ")
	UsuarioRestDTO obterUser(@Param("login") String login);
}
//	private String senha;
//	private String email;
//	private Boolean ativo;