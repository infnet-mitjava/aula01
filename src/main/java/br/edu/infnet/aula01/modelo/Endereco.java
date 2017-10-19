package br.edu.infnet.aula01.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id @GeneratedValue
	private Integer id;
	
	private String logradouro;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	

}
