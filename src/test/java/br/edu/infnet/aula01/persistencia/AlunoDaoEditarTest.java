package br.edu.infnet.aula01.persistencia;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import br.edu.infnet.aula01.modelo.Aluno;

public class AlunoDaoEditarTest {
	
	Aluno aluno = new Aluno();
	Dao dao = new AlunoDao();
	
	@Before
	public void setup() {
		aluno = new Aluno();
		aluno.setNome("Janete");
		aluno.setMatricula("6563");
		aluno.setEndereco("Rua Pindamonhagaba");		
		dao.salvar(aluno);
	}
	
	
	
	@Test
	public void editarAluno() {
	//arrange
		aluno.setEndereco("endereco novo");
		aluno.setMatricula("123");
		
		//act
		dao.atualizar(aluno);
		
	//assert	
		MatcherAssert.assertThat(aluno.getEndereco(), 
								Matchers.is("endereco novo"));
		
		
	}
	

}
