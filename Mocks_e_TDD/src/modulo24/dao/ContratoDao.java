package modulo24.dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Sem conexão com banco de dados");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Sem conexão com banco de dados");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Sem conexão com banco de dados");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Sem conexão com banco de dados");
    }
}
