package banco;

public class ContaCorrente extends ContaBancaria {
	// Limite do cheque especial da conta corrente
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial) {
    	// Chama o construtor da classe pai (ContaBancaria)
        super(numeroConta, saldo);
        // Inicializa o limite do cheque especial da conta corrente
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public void depositar(double valor) {
    	// Incrementa o valor depositado ao saldo da conta corrente
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
    	// Verifica se há saldo disponível (incluindo o limite do cheque especial) para o saque
        if (valor <= saldo + limiteChequeEspecial) {
        	// Saca o valor do saldo da conta corrente
            saldo -= valor;
        } else {
        	// Exibe uma mensagem de saldo insuficiente se o saque não for possível
            System.out.println("Saldo insuficiente.");
        }
    }
}
