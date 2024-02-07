package test.java.mock;

import main.java.dao.ICLienteDAO;
import main.java.domain.Cliente;
import main.java.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDAOMock implements ICLienteDAO {

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
