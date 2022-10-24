package com.cadastro.model.entity;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nome;
	@Column
	private String Enderco;
	@Column
	private String telefone;
	@Column
	private String Cpf;
	
	@ManyToMany
	private List<Acesso> acessos ;

	public String getSenha() {
		
		return null;
	}

	public void setSenha(String encode) {
		
		
	}

	public String getUsername() {
		
		return null;
	}
		
		
	}
	
	
	
	
	
	

