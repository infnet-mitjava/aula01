package br.edu.infnet.aula01.persistencia;

import br.edu.infnet.aula01.modelo.Boletim;

public class BoletimDao extends JpaDao<Boletim> {

	public BoletimDao() {
		super(Boletim.class);
	}

}
