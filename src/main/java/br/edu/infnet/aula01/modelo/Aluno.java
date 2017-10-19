package br.edu.infnet.aula01.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Aluno {

	@Id 
	@GeneratedValue
	private Integer id;
	private String nome;
	private String matricula;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	
	@ManyToOne
	private Turma turma;

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

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}


}
