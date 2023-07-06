package banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Agencia> agencias;
    private static double taxaJuros; 

    public Banco(String nome) {
    	// Inicializa o nome do banco
        this.nome = nome;
        // Inicializa a lista de agências do banco
        this.agencias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAgencia(Agencia agencia) {
    	// Adiciona uma nova agência à lista de agências do banco
        agencias.add(agencia);
    }

    public List<Agencia> getAgencias() {
    	// Retorna a lista de agências do banco
        return agencias;
    }

    public static double getTaxaJuros() {
    	// Retorna a taxa de juros do banco
        return taxaJuros;
    }

    public static void setTaxaJuros(double taxa) {
    	// Define a taxa de juros do banco
        taxaJuros = taxa;
    }
}
