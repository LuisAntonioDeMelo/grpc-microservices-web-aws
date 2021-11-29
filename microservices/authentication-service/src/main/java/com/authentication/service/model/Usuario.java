package com.authentication.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String login;
	
	private String senha;

	private String email;
	
	private boolean ativo;

	@JsonIgnore
	@JoinColumn(name = "pessoa_id")
	@ManyToOne
	private Pessoa pessoa;

//	@JsonIgnore
//	@ManyToMany
//	private List<Grupo> grupos;
//
//	@JsonIgnore
//	@ManyToMany
//	private List<Permissao> permissoes;

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + "]";
	}
}
