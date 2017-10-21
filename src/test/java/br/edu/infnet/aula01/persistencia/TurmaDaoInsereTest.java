package br.edu.infnet.aula01.persistencia;

import java.util.Arrays;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import br.edu.infnet.aula01.modelo.Aluno;
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
	
	
	@Test
	public void insereAlunosNaTurma() {
		Turma turma = new Turma();
		turma.setNome("Php Iniciante");
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jose");
		aluno.setTurma(turma);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Fernando");
		aluno2.setTurma(turma);
		
		turma.setAlunos(Arrays.asList(aluno, aluno2));
		
		TurmaDao dao = new TurmaDao();
		dao.salvar(turma);
		MatcherAssert.assertThat(turma.getId(), Matchers.notNullValue());
	}
	

}
