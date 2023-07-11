package banco;
import java.util.List;

// Interface de clientes, contendo pessoa física e pessoa jurídica
public interface Cliente {
    String getNome();
    List<ContaBancaria> getContas();
    void adicionarConta(ContaBancaria conta);
}
