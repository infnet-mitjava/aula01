package br.edu.infnet.aula01.persistencia;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import br.edu.infnet.aula01.modelo.Aluno;

public class AlunoDaoInserirAlunoTest {

	@Test
	public void gravaAlunoNoBanco() {
		//arrange 
		Aluno aluno = new Aluno();
		aluno.setNome("Janete");
		aluno.setMatricula("6563");
		aluno.setEndereco("Rua Pindamonhagaba");		
		
		//act 
		Dao dao = new AlunoDao();
		dao.salvar(aluno);
		
		//assert
		MatcherAssert.assertThat(aluno.getId(), Matchers.notNullValue());
		
	}
	
	
}
