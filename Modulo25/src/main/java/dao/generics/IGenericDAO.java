package main.java.dao.generics;

import main.java.domain.Persistente;
import main.java.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;
public interface IGenericDAO <T extends Persistente> {
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
    public void excluir(Long valor);
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
}