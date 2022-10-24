package com.cadastro.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "acessos")
public class Acesso {

	@Id
	@GeneratedValue
private Long id;
private String nome_acesso;

public Acesso(Long id) {
	this.id = id;
	
}
}
