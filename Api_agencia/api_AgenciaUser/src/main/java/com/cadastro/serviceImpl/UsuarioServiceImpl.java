package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.entity.Usuario;
import com.cadastro.repositories.UsuarioReporitory;

@Service
public abstract  class UsuarioServiceImpl implements com.cadastro.service.UsuarioService {

	@Autowired
	private UsuarioReporitory UsuarioRepository;
	
	private BCryptPasswordEncoder PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public Usuario saveUsuario(Usuario Usuario) {
		return UsuarioRepository.save(Usuario);
	}
	
    
	@Override
	public List<Usuario> getAllusuario() {
		return UsuarioRepository.findAll();
	}

	@Override
	public Usuario getUsuarioById(long id) {
		return UsuarioRepository.findById(id).orElseThrow(()-> 
		new ResourceNotFoundException("Usuario", "id", id));
	}

	@Override
	public  Usuario  updateUsuario ( Usuario   Usuario , long id) { 
		
		 Usuario  UsuarioExistente =  UsuarioRepository.findById(id).orElseThrow(() ->
		 new ResourceNotFoundException("Usuario", "id", id));
			
		 UsuarioExistente.setNome( Usuario.getNome());
		 UsuarioExistente.setEnderco( Usuario.getEnderco());
		 UsuarioExistente.setTelefone( Usuario.getTelefone());
		 UsuarioExistente.setCpf( Usuario.getCpf());
		 
		 Usuario.setSenha(PasswordEncoder().encode(Usuario.getSenha()));
		 
		 UsuarioRepository.save( UsuarioExistente);
		return  UsuarioExistente;
	}
	@Override
	public void deleteUsuario(long id) {
		UsuarioRepository.findById(id).orElseThrow(() ->
		 new ResourceNotFoundException("Usuario", "id", id));

         UsuarioRepository.deleteById(id);
}
		
	}

	
	 
