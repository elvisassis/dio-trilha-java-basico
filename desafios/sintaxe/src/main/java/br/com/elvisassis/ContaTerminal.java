package br.com.elvisassis;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroDaConta = 0;
        String agencia;
        String nomeCliente;
        float saldo = 0;

        System.out.println("Por favor digite o número da conta!");
        while (!scanner.hasNextInt()){
            System.out.println("Valor inválido. Digite um número inteiro:");
            scanner.next(); // descarta entrada inválida
        }
        numeroDaConta = scanner.nextInt();

        System.out.println("Por favor digite a agência!");
        agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor digite o seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o saldo!");
        while (!scanner.hasNextFloat()) {
            System.out.println("Valor inválido. Digite um número com ponto decimal (ex: 2500.75):");
            scanner.next(); // descarta entrada inválida
        }
            saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}