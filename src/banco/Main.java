package banco;

public class Main {
    public static void main(String[] args) {
    	// Criação dos objetos
        Banco banco = new Banco("MyBank");

        Agencia agencia1 = new Agencia("001");
        Agencia agencia2 = new Agencia("002");

        Cliente PessoaFisica1 = new PessoaFisica("Jodosvildo", "12345678900");
        Cliente PessoaFisica2 = new PessoaFisica("Cleberildo", "00987654321");
        
        Cliente pessoaJuridica1 = new PessoaJuridica("Jodoslandia", "123456789");
        Cliente pessoaJuridica2 = new PessoaJuridica("Cleberondes", "987654321");

        ContaCorrente contaCorrente1 = new ContaCorrente("12345", 1000, 500);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("67890", 5000, 0.05);

        ContaCorrente contaCorrente2 = new ContaCorrente("54321", 2000, 1000);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("09876", 8000, 0.03);

        PessoaFisica1.adicionarConta(contaCorrente1);
        PessoaFisica1.adicionarConta(contaPoupanca1);

        PessoaFisica2.adicionarConta(contaCorrente2);
        PessoaFisica2.adicionarConta(contaPoupanca2);
        
        pessoaJuridica1.adicionarConta(contaCorrente1);
        pessoaJuridica2.adicionarConta(contaPoupanca2);

        agencia1.adicionarCliente(PessoaFisica1);
        agencia2.adicionarCliente(PessoaFisica2);

        banco.adicionarAgencia(agencia1);
        banco.adicionarAgencia(agencia2);

        // Exemplo de utilização dos métodos das classes

        // Obtendo o nome do banco
        System.out.println("Nome do banco: " + banco.getNome());

        // Listando os clientes de uma agência
        System.out.println("Clientes da agência " + agencia1.getNumeroAgencia() + ":");
        for (Cliente cliente : agencia1.getClientes()) {
            System.out.println(cliente.getNome());
        }

        // Obtendo o saldo de uma conta corrente
        System.out.println("Saldo da conta corrente do cliente " + PessoaFisica1.getNome() + ": " +
                contaCorrente1.getSaldo());

        // Depositar em uma conta corrente
        contaCorrente1.depositar(500);

        // Sacar de uma conta poupança
        contaPoupanca1.sacar(200);

        // Obtendo a lista de contas de um cliente
        System.out.println("Contas do cliente " + PessoaFisica1.getNome() + ":");
        for (ContaBancaria conta : PessoaFisica1.getContas()) {
            System.out.println("Número da conta: " + conta.getNumeroConta() + ", Saldo: " + conta.getSaldo());
        }
        
        // Separação
        System.out.println("--------------------------------------------------------------------");
        
        // Utilizando polimorfismo para chamar métodos específicos de ContaCorrente e ContaPoupanca
        for (Cliente cliente : agencia2.getClientes()) {
            System.out.println("Cliente: " + cliente.getNome());
            for (ContaBancaria conta : cliente.getContas()) {
                System.out.println("Número da conta: " + conta.getNumeroConta() + ", Saldo: " + conta.getSaldo());

                if (conta instanceof ContaCorrente) {
                    ContaCorrente contaCorrente = (ContaCorrente) conta;
                    System.out.println("Limite do cheque especial: " + contaCorrente.getLimiteChequeEspecial());
                } else if (conta instanceof ContaPoupanca) {
                    ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                    System.out.println("Taxa de rendimento: " + contaPoupanca.getTaxaRendimento());
                }
            }
            System.out.println();
        }
        
     // Separação
        System.out.println("--------------------------------------------------------------------");
        
     // Utilizando métodos específicos de PessoaJuridica
        System.out.println("Informações da pessoa jurídica " + pessoaJuridica1.getNome() + ":");
        System.out.println("CNPJ: " + ((PessoaJuridica) pessoaJuridica1).getCnpj());
        System.out.println("Nome da empresa: " + ((PessoaJuridica) pessoaJuridica1).getNome());

        // Adicionando uma nova conta à pessoa jurídica
        ((PessoaJuridica) pessoaJuridica1).adicionarConta(contaPoupanca1);

        // Listando as contas da pessoa jurídica
        System.out.println("Contas da pessoa jurídica " + pessoaJuridica1.getNome() + ":");
        for (ContaBancaria conta : pessoaJuridica1.getContas()) {
            System.out.println("Número da conta: " + conta.getNumeroConta() + ", Saldo: " + conta.getSaldo());
        }
    }
}
