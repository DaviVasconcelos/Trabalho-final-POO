package banco;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String numeroAgencia;
    private List<Cliente> clientes;

    public Agencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.clientes = new ArrayList<>();
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    // Outros métodos relevantes para a agência
}
