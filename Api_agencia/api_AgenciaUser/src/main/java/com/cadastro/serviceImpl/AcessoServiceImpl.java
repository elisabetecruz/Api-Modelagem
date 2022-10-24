package com.cadastro.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.model.DTO.UsuarioAcessoDTO;
import com.cadastro.model.entity.Acesso;
import com.cadastro.model.entity.Usuario;
import com.cadastro.repositories.UsuarioReporitory;
import com.cadastro.service.AcessoService;

@Service
public class AcessoServiceImpl  implements AcessoService{

	@Autowired
	UsuarioReporitory usuarioRepository;
	
	@Override
	public Usuario execultar(UsuarioAcessoDTO usuarioAcessoDTO) {
		
		Optional<Usuario> ususrioExists = usuarioRepository.findById(usuarioAcessoDTO.getIdUser());
		
		List<Acesso> acessos = new ArrayList<>();
		
		if (ususrioExists.isEmpty()) {
			throw new Error ("Usuario não encontrado");
		}
		
		acessos = usuarioAcessoDTO.getIdsAcesso().stream().map(acesso ->
				 {
					 return new Acesso(acesso);
						}).collect(Collectors.toList());
		Usuario usuario = ususrioExists.get();
		
		usuario.setAcessos(acessos);
		usuarioRepository.save(usuario);
		
		   return usuario;
		    
	}
}
