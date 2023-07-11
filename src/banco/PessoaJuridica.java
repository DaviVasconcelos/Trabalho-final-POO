package banco;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridica implements Cliente {
	// Nome da empresa
    private String nomeEmpresa;
    // CNPJ da empresa
    private String cnpj;
    // Lista de contas da empresa
    private List<ContaBancaria> contas;

    public PessoaJuridica(String nomeEmpresa, String cnpj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.contas = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nomeEmpresa;
    }

    @Override
    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public String getCnpj() {
        return cnpj;
    }
}
