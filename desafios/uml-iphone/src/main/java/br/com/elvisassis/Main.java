package br.com.elvisassis;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        while(true) {
            System.out.println("\n--- Escolha uma funcionalidade ---");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho telefonico");
            System.out.println("3 - NavegadorInternet");
            System.out.println("4 - Desligar");
            option = scanner.nextInt();
            if (option == 1){
                ReprodutoMusical reprodutorMusical = criarReprodutorMusical();
                System.out.println("\n--- Reprodutor Musical Ativo ---");
                reprodutorMusical.tocarMusica("Minha musica favorita");
                reprodutorMusical.selecionarMusica();
                reprodutorMusical.pausarMusica();
            }
            else if(option == 2){
                AparelhoTelefonico aparelhoTelefonico = criarAparelhoTelefonico();
                System.out.println("\n--- Aparelho Telefônico Ativo ---");
                aparelhoTelefonico.fazerLigacao("11987654321");
                aparelhoTelefonico.atenderLigacao();
                aparelhoTelefonico.adicionarContato("Elvis", "1233556");
            }
            else if (option == 3) {
                NavegadorInternet navegadorInternet = criarNavegadorWeb();
                System.out.println("\n--- Navegador Web Ativo ---");
                navegadorInternet.exibirPaginaAtual("www.google.com");
                navegadorInternet.adicionarNovaAba();
                navegadorInternet.atualizarPagina();
            }
            else if (option == 4) {
                System.out.println("Desligando o Iphone...");
                break; // Sai do loop
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
        scanner.close();
    }

    private static Iphone criarReprodutorMusical() {
        var reprodutorMusical = new Iphone();
        return  reprodutorMusical;
    }

    private static Iphone criarAparelhoTelefonico(){
        var aparelhoTelefonico = new Iphone();
        return aparelhoTelefonico;
    }

    private static Iphone criarNavegadorWeb(){
        var navegadorIntenert = new Iphone();
        return navegadorIntenert;
    }
}