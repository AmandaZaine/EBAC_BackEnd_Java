package test.java;

import main.java.dao.ICLienteDAO;
import main.java.domain.Cliente;
import main.java.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.mock.ClienteDAOMock;

public class ClienteDAOTest {
    private ICLienteDAO cLienteDAO;
    private Cliente cliente;

    public ClienteDAOTest() {
        cLienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(80077795878L);
        cliente.setNome("Carol");
        cliente.setCidade("Cuiaba");
        cliente.setEndereco("Avenida Brasil");
        cliente.setNumero(1500);
        cliente.setEstado("MT");
        cliente.setTelefone(987654321L);
        cLienteDAO.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado =  cLienteDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = cLienteDAO.cadastrar(cliente);

        Assert.assertNotNull(retorno);
    }

    @Test
    public void excluirCliente() {
        cLienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Carol");
        cLienteDAO.alterar(cliente);

        Assert.assertEquals("Carol", cliente.getNome());
    }
}
