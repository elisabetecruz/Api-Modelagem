package com.cadastro.controller;

import java.util.List;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cadastro.model.entity.Usuario;

import com.cadastro.serviceImpl.UsuarioServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("api/agencia")
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceImpl service;
	

	//REQUEST TESTE
	@GetMapping("/home")
	public String HelloWorld() {
		return"Oi";
	}
	
	// REQUEST DE LISTAGEM
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() { 
		List<Usuario>  Usuario =  service.getAllusuario();
		return ResponseEntity.ok().body(Usuario);
	}
	
	// REQUEST POR ID	
	@GetMapping("{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") long UsuarioId) { 
			return new ResponseEntity<Usuario>(service.getUsuarioById(UsuarioId), HttpStatus.OK);
		}
	
	//REQUEST PARA SALVAR	
	@PostMapping
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario Usuario){
			return new ResponseEntity<Usuario>(service.saveUsuario(Usuario), HttpStatus.CREATED);
		}
	
	//REQUEST PARA ATUALIZAR	
	@PutMapping("{id}")
		public ResponseEntity<Usuario> updateUsuario(@PathVariable("id") long id, 
				@RequestBody Usuario Usuario){
			return new ResponseEntity<Usuario>(service.updateUsuario(Usuario, id), HttpStatus.OK);
		}
	//REQUEST PARA DELETAR
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteUsuario(@PathVariable("id") long id){
			service.deleteUsuario(id);
			
			return new ResponseEntity<String>("Usuario deletado com sucesso.", 
					HttpStatus.OK);
		}
}