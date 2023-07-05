package banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Agencia> agencias;
    private static double taxaJuros;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAgencia(Agencia agencia) {
        agencias.add(agencia);
    }

    public static double getTaxaJuros() {
        return taxaJuros;
    }

    public static void setTaxaJuros(double taxa) {
        taxaJuros = taxa;
    }

    // Outros métodos relevantes para o banco
}
