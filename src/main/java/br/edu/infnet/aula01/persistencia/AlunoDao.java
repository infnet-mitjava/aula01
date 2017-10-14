package br.edu.infnet.aula01.persistencia;

import br.edu.infnet.aula01.modelo.Aluno;

public class AlunoDao extends JpaDao<Aluno> {

	public AlunoDao() {
		super(Aluno.class);
	}
	

}
