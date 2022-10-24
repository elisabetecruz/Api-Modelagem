package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cadastro.model.entity.Passagens;
import com.cadastro.repositories.PassagensRepository;


public class PassagensServiceImpl {

	@Autowired
	private PassagensRepository Passagensrepository;
	//@Override
	public  PassagensServiceImpl(Passagens Passagens) {
		return;
	}

	//@Override
	public List<Passagens> getAllPassagens() {
		return Passagensrepository.findAll();
	}

	//@Override
	public Passagens getPassagensById(long id) {
		return Passagensrepository.findById(id).orElseThrow();
		
	}

	//@Override
	public  Passagens  updatePassagens( Passagens   Passagens , long id) { 
		
		Passagens PassagensExistente =Passagensrepository.findById(id).orElseThrow();
		
		PassagensExistente.setNome( Passagens.getNome());
		PassagensExistente.setNome(Passagens.getNome());
		
		
		Passagensrepository.save( PassagensExistente);
		return  PassagensExistente;
	}
	//@Override
	public void deletePassagens(long id) {
		Passagensrepository.findById(id).orElseThrow();
		Passagensrepository.deleteById(id);
}
}
