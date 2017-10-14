package br.edu.infnet.aula01.persistencia;

import br.edu.infnet.aula01.modelo.Turma;

public class TurmaDao extends JpaDao<Turma> {

	public TurmaDao() {
		super(Turma.class);
	}
	
}
