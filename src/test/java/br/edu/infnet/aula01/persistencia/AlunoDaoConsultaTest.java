package br.edu.infnet.aula01.persistencia;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import br.edu.infnet.aula01.modelo.Aluno;
import br.edu.infnet.aula01.modelo.Endereco;

public class AlunoDaoConsultaTest {
	

	Aluno aluno = new Aluno();
	Dao dao = new AlunoDao();
	
	@Before
	public void setup() {
		aluno = new Aluno();
		aluno.setNome("Janete");
		aluno.setMatricula("6563");
		aluno.setEndereco(new Endereco("Rua Honorio"));		
		dao.salvar(aluno);
	}
	
	@Test
	public void consultaUmAluno() {
		
		//act
		Aluno alunoDB = (Aluno) dao.getById(aluno.getId());
		
		//assert
		MatcherAssert.assertThat(alunoDB, Matchers.notNullValue());
		
	}
	

	@Test
	public void consultaUmAlunoInexistente() {
		
		//act
		Aluno alunoDB = (Aluno) dao.getById(999);
		
		//assert
		MatcherAssert.assertThat(alunoDB, Matchers.nullValue());
		
	}


}
