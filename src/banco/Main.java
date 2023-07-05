package banco;

public class Main {
    public static void main(String[] args) {
        // Código do sistema de banco MyBank
        Banco banco = new Banco("MyBank");

        Agencia agencia1 = new Agencia("001");
        Agencia agencia2 = new Agencia("002");

        Cliente cliente1 = new Cliente("Jodosvildo");
        Cliente cliente2 = new Cliente("Cleberson");

        ContaCorrente contaCorrente1 = new ContaCorrente("12345", 1000, 500);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("67890", 5000, 0.05);

        ContaCorrente contaCorrente2 = new ContaCorrente("54321", 2000, 1000);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("09876", 8000, 0.03);

        cliente1.adicionarConta(contaCorrente1);
        cliente1.adicionarConta(contaPoupanca1);

        cliente2.adicionarConta(contaCorrente2);
        cliente2.adicionarConta(contaPoupanca2);

        agencia1.adicionarCliente(cliente1);
        agencia2.adicionarCliente(cliente2);

        banco.adicionarAgencia(agencia1);
        banco.adicionarAgencia(agencia2);

        // Execução das classes e seus métodos cliente 1
        System.out.println("Nome do banco: " + banco.getNome());

        System.out.println("Clientes da agência " + agencia1.getNumeroAgencia() + ":");
        for (Cliente cliente : agencia1.getClientes()) {
            System.out.println(cliente.getNome());
        }

        System.out.println("Saldo da conta corrente do cliente " + cliente1.getNome() + ": " +
                contaCorrente1.getSaldo());

        contaCorrente1.depositar(500);
        contaCorrente1.sacar(200);

        System.out.println("Saldo atualizado da conta corrente do cliente " + cliente1.getNome() + ": " +
                contaCorrente1.getSaldo());
        
        
        // Execução das classes e seus métodos cliente 2
        System.out.println("Nome do banco: " + banco.getNome());

        System.out.println("Clientes da agência " + agencia2.getNumeroAgencia() + ":");
        for (Cliente cliente : agencia2.getClientes()) {
            System.out.println(cliente.getNome());
        }

        System.out.println("Saldo da conta corrente do cliente " + cliente2.getNome() + ": " +
                contaCorrente2.getSaldo());

        contaCorrente2.depositar(500);
        contaCorrente2.sacar(200);

        System.out.println("Saldo atualizado da conta corrente do cliente " + cliente2.getNome() + ": " +
                contaCorrente2.getSaldo());
    }
}
