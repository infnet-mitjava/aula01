package br.edu.infnet.aula01.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id 
	@GeneratedValue
	private Integer id;
	private String nome;
	private String matricula;
	private String endereco;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
