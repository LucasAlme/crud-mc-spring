package com.estudo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.cursomc.domain.Categoria;
import com.estudo.cursomc.repositories.CategoriaRepository;
import com.estudo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository rep;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = rep.findById(id);
		obj.orElseThrow(() -> new  ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		return obj.orElse(null);
		
	}

}
