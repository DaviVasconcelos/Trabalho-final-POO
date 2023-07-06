package banco;

public class ContaPoupanca extends ContaBancaria {
	// Taxa de rendimento da conta poupança
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldo, double taxaRendimento) {
    	// Chama o construtor da classe pai (ContaBancaria)
        super(numeroConta, saldo);
        // Inicializa a taxa de rendimento da conta poupança
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void depositar(double valor) {
    	// Incrementa o valor depositado ao saldo da conta poupança
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
    	// Verifica se há saldo suficiente para o saque
        if (valor <= saldo) {
        	// Saca do saldo da conta poupança
            saldo -= valor;
        } else {
        	// Exibe uma mensagem de saldo insuficiente se o saque não for possível
            System.out.println("Saldo insuficiente.");
        }
    }
}
