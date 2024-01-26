package modulo24.service;

import modulo24.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao dao;
    public ContratoService(IContratoDao dao) {
        this.dao = dao;
    }

    @Override
    public String salvar() {
        dao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        dao.buscar();
        return "Busca realizada";
    }

    @Override
    public String excluir() {
        dao.excluir();
        return "Exclusao realizada";
    }

    @Override
    public String atualizar() {
        dao.atualizar();
        return "Atualizacao realizada";
    }
}
