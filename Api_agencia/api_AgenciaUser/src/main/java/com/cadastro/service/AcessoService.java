package com.cadastro.service;

import com.cadastro.model.DTO.UsuarioAcessoDTO;
import com.cadastro.model.entity.Usuario;

public interface AcessoService {

	Usuario execultar (UsuarioAcessoDTO usuarioAcessoDTO);
}
