package br.edu.infnet.aula01.persistencia;

public interface Dao<T> {

	void salvar(T entity);

	void atualizar(T entity);

	T getById(Integer id);

}