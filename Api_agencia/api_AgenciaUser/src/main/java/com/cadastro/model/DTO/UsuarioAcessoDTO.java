package com.cadastro.model.DTO;

import java.util.List;

import lombok.Data;

@Data
public class UsuarioAcessoDTO {

	private Long idUser;
	
	private List<Long> idsAcesso;
}
