package test.java;

import main.java.dao.ICLienteDAO;
import main.java.exceptions.TipoChaveNaoEncontradaException;
import main.java.services.ClienteService;
import main.java.domain.Cliente;
import main.java.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.mock.ClienteDAOMock;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        ICLienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(80077795878L);
        cliente.setNome("Carol");
        cliente.setCidade("Cuiaba");
        cliente.setEndereco("Avenida Brasil");
        cliente.setNumero(1500);
        cliente.setEstado("MT");
        cliente.setTelefone(987654321L);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado =  clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteService.salvar(cliente);

        Assert.assertNotNull(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Carol");
        clienteService.alterar(cliente);

        Assert.assertEquals("Carol", cliente.getNome());
    }
}
