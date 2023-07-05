package banco;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<ContaBancaria> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    // Outros métodos relevantes para o cliente
}