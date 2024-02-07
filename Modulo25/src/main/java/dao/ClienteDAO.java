package main.java.dao;

import main.java.dao.generics.GenericDAO;
import main.java.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements ICLienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }
}