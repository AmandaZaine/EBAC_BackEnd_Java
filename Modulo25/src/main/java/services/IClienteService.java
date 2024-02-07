package main.java.services;

import main.java.domain.Cliente;
import main.java.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;
    Cliente buscarPorCpf(Long cpf);
    void excluir(Long cpf);
    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
