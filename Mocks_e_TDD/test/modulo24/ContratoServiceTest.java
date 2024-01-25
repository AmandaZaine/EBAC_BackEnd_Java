package modulo24;

import modulo24.dao.ContratoDao;
import modulo24.dao.IContratoDao;
import modulo24.dao.mocks.ContratoDaoMock;
import modulo24.service.ContratoService;
import modulo24.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvar() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void salvarNoBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }
}
