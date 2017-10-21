package br.edu.infnet.aula01.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boletim {

	@Id
	@GeneratedValue
	private Integer id;
	private String nomeAluno;
	private String turma;

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getTurma() {
		return turma;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
