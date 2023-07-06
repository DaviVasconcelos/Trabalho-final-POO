package banco;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	// Nome do cliente
    private String nome;
    // Lista de contas do cliente
    private List<ContaBancaria> contas;

    public Cliente(String nome) {
    	// Inicializa o nome do cliente
        this.nome = nome;
        // Inicializa a lista de contas do cliente
        this.contas = new ArrayList<>();
    }

    public String getNome() {
    	// Retorna o nome do cliente
        return nome;
    }

    public void adicionarConta(ContaBancaria conta) {
    	// Adiciona uma nova conta à lista de contas do cliente
        contas.add(conta);
    }

    public List<ContaBancaria> getContas() {
    	// Retorna a lista de contas do cliente
        return contas;
    }
}
