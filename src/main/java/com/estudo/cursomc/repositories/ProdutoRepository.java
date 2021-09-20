package com.estudo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
