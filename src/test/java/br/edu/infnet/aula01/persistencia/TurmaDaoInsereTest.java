package br.edu.infnet.aula01.persistencia;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import br.edu.infnet.aula01.modelo.Turma;

public class TurmaDaoInsereTest {
	
	@Test
	public void insereBanco() {
		Turma turma = new Turma();
		turma.setNome("JavaAvancado");
		
		TurmaDao dao = new TurmaDao();
		dao.salvar(turma);
		
		MatcherAssert.assertThat(turma.getId(), Matchers.notNullValue());
		
	}
	

}
