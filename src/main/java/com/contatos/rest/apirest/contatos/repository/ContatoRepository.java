package com.contatos.rest.apirest.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contatos.rest.apirest.contatos.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
	Contato findById(long id_contato);

}

