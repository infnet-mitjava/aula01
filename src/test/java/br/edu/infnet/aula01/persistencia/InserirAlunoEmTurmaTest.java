package br.edu.infnet.aula01.persistencia;

import java.util.Arrays;

import org.junit.Test;

import br.edu.infnet.aula01.modelo.Aluno;
import br.edu.infnet.aula01.modelo.Endereco;
import br.edu.infnet.aula01.modelo.Turma;

public class InserirAlunoEmTurmaTest {

	@Test
	public void inserirAluno() {
		AlunoDao alunoDao = new AlunoDao();
		TurmaDao turmaDao = new TurmaDao();
		Turma turmaJava = new Turma();
		Aluno marcos = new Aluno();
		marcos.setNome("marcos");
		marcos.setEndereco(new Endereco("rua nova a"));
		marcos.setMatricula("1");
		Aluno jose = new Aluno();
		jose.setEndereco(new Endereco("rua nova b"));
		jose.setMatricula("2");
		jose.setNome("jose");
		jose.setTurma(turmaJava);
		marcos.setTurma(turmaJava);
		turmaJava.setNome("TJava");
		turmaJava.setNome("Turma de Java");
		turmaJava.setAluno(Arrays.asList(jose, marcos));
		
		turmaDao.salvar(turmaJava);
		
	}
	
}
