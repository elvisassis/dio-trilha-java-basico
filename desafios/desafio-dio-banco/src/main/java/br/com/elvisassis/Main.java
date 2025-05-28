package br.com.elvisassis;

import br.com.elvisassis.exception.SaldoInsuficientException;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Banco banco = Banco.getInstance();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nBem-vindo ao " + banco.getNome() + "!");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Login");
            System.out.println("0 - Sair");

            int operacao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (operacao) {
                case 1 -> criarConta();
                case 2 -> fazerLogin();
                case 0 -> {
                    System.out.println("Encerrando aplicação...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void criarConta() {
        System.out.print("Informe o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o CPF do cliente: ");
        String cpf = scanner.nextLine();

        System.out.print("Informe o endereço do cliente: ");
        String endereco = scanner.nextLine();

        System.out.println("Informe o tipo de conta:");
        System.out.println("0 - CORRENTE");
        System.out.println("1 - POUPANÇA");
        int tipoConta = scanner.nextInt();

        System.out.print("Informe o valor inicial para criar a conta: ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine(); // limpa buffer

        Cliente cliente = new Cliente(nome, cpf, endereco);
        IConta novaConta = ContaFactory.criarConta(tipoConta, cliente, saldoInicial);
        Banco.adicionarConta(novaConta);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Conta número: " + novaConta.getNumeroConta());
    }

    private static void fazerLogin() {
        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // limpa buffer

        IConta conta = banco.login(numeroConta);
        if (conta != null) {
            System.out.println("Login realizado com sucesso!");
            menuConta(conta);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void menuConta(IConta conta) {
        int opcao;
        do {
            System.out.println("\n--- Menu da Conta ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar Cheque Especial");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Sacar Dinheiro");
            System.out.println("5. Pagar Boleto");
            System.out.println("6. Verificar Uso do Cheque Especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (opcao) {
                case 1 -> System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldo());
                case 2 -> System.out.printf("Cheque especial disponível: R$ %.2f%n", conta.consultarChequeEspecial());
                case 3 -> {
                    System.out.print("Informe o valor para depósito: ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                }
                case 4 -> {
                    System.out.print("Informe o valor para saque: ");
                    double valor = scanner.nextDouble();
                    if (conta.sacar(valor)) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                }
                case 5 -> {
                    System.out.print("Informe o valor do boleto: ");
                    double valor = scanner.nextDouble();
                    if (conta.pagarBoleto(valor)) {
                        System.out.println("Boleto pago com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto.");
                    }
                }
                case 6 -> {
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("A conta está utilizando o cheque especial.");
                    } else {
                        System.out.println("A conta não está utilizando o cheque especial.");
                    }
                }
                case 0 -> System.out.println("Saindo da conta...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
