package modulo24.dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Sem conexão com banco de dados");
    }
}
