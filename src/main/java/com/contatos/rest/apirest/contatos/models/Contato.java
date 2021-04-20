package com.contatos.rest.apirest.contatos.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_CONTATOS")
public class Contato implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_contato;
	
	@NotNull
	private String tx_nome;
	
	@NotNull
	private String tx_email;
	
	@NotNull
	private String tx_telefone;
	
	@NotNull
	private String tx_sexo;

	public long getId_contato() {
		return id_contato;
	}

	public void setId_contato(long id_contato) {
		this.id_contato = id_contato;
	}

	public String getTx_nome() {
		return tx_nome;
	}

	public void setTx_nome(String tx_nome) {
		this.tx_nome = tx_nome;
	}

	public String getTx_email() {
		return tx_email;
	}

	public void setTx_email(String tx_email) {
		this.tx_email = tx_email;
	}

	public String getTx_telefone() {
		return tx_telefone;
	}

	public void setTx_telefone(String tx_telefone) {
		this.tx_telefone = tx_telefone;
	}

	public String getTx_sexo() {
		return tx_sexo;
	}

	public void setTx_sexo(String tx_sexo) {
		this.tx_sexo = tx_sexo;
	}
	
	
}
