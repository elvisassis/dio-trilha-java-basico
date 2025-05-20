package br.com.elvisassis;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitorEntradas = new Scanner(System.in);
        System.out.println("Digite o valor do salário.");
        float valorSalario = leitorEntradas.nextFloat();
        System.out.println("Digite o valor do beneficio");
        float valorBeneficios = leitorEntradas.nextFloat();

        float imposto = calcularImposto(valorSalario);
        float salario =  valorSalario - imposto + valorBeneficios;
        System.out.println("O salário será de " + String.format("%.2f", salario));
    }

    static float calcularImposto(float valorSalario) {
        float aliquota = 0;
        if (valorSalario >= 0 && valorSalario <= 1100.00)
            aliquota= 0.05F;
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            aliquota = 0.1F;
        } else
            aliquota = 0.15F ;
        return aliquota * valorSalario;
    }
}