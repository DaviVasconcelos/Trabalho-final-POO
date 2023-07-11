package banco;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisica implements Cliente {
	// Nome da pessoa física
    private String nome;
    // Lista de contas da pessoa física
    private List<ContaBancaria> contas;
    // CPF da pessoa física
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
    	// Retorna o nome da pessoa física
        return nome;
    }

    @Override
    public List<ContaBancaria> getContas() {
    	// Retorna a lista de contas da pessoa física
        return contas;
    }
    
    public String getCPF() {
        return cpf; // Retorna o CPF da pessoa física
    }

    public void adicionarConta(ContaBancaria conta) {
    	// Adiciona uma nova conta à lista de contas da pessoa física
        contas.add(conta);
    }
}
