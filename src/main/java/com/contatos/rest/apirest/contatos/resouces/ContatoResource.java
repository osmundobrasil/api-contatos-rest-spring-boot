package com.contatos.rest.apirest.contatos.resouces;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contatos.rest.apirest.contatos.repository.ContatoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.contatos.rest.apirest.contatos.models.Contato;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Contatos")

public class ContatoResource {
	
	@Autowired
	ContatoRepository contatoRepository;

	@ApiOperation(value="Retorna uma lista de Contatos")
	@GetMapping("/contatos")
	public List<Contato> listaContatos(){
		return contatoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um Contato")
	@GetMapping("/contatos/{id_contato}")
	public Contato listaUmContato(@PathVariable(value="id_contato") long id_contato){
		return contatoRepository.findById(id_contato);
	}
	
	@ApiOperation(value="Salva um Contatp")
	@PostMapping("/contatos")
	public Contato salvaContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
	
	@ApiOperation(value="Deleta um Contato")
	@DeleteMapping("/contatos")
	public void deletaContato(@RequestBody Contato contato) {
		contatoRepository.delete(contato);
	}

	@ApiOperation(value="Atualiza um Contato")
	@PutMapping("/contatos")
	public Contato atualizaContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}

}

	
	
