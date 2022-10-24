package com.cadastro.service;

import com.cadastro.model.entity.Passagens;


public interface PassagensService {

	Passagens savePassagens(Passagens Passagens);
	java.util.List<Passagens> getAllusuario();
	Passagens getPassagensById(long id);
	Passagens updatePassagens(Passagens Passagens, long id);
	void deletePassagens(long id);
}
