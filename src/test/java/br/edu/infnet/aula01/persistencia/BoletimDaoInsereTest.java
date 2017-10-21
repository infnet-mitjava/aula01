package br.edu.infnet.aula01.persistencia;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;

import br.edu.infnet.aula01.modelo.Boletim;

public class BoletimDaoInsereTest {
	
	@Test
	public void insereBoletim() {
		Boletim boletim = new Boletim();
		boletim.setNomeAluno("Ze");
		boletim.setTurma("EinJava01");
		
		BoletimDao dao = new BoletimDao();
		dao.salvar(boletim);
		
		assertThat(boletim.getId(), notNullValue());
		
		
		
	}
	

}
