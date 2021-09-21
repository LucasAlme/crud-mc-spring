package com.estudo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.cursomc.domain.Cliente;
import com.estudo.cursomc.repositories.ClienteRepository;
import com.estudo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository rep;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = rep.findById(id);
		obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		return obj.orElse(null);
	}
}
