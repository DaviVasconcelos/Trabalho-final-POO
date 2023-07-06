package banco;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String numeroAgencia;
    // Lista de clientes da agência
    private List<Cliente> clientes;

    public Agencia(String numeroAgencia) {
    	// Inicializa o número da agência
        this.numeroAgencia = numeroAgencia;
        // Inicializa a lista de clientes da agência
        this.clientes = new ArrayList<>();
    }

    public String getNumeroAgencia() {
    	// Retorna o número da agência
        return numeroAgencia;
    }

    public void adicionarCliente(Cliente cliente) {
    	// Adiciona um novo cliente à lista de clientes da agência
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
    	// Retorna a lista de clientes da agência
        return clientes;
    }
}
