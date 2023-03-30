package br.uninove.telas;

import java.util.Scanner;

public class OperacoesMatematicas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Digite o 1º valor: ");
        a = sc.nextDouble();

        System.out.print("Digite o 2º valor: ");
        b = sc.nextDouble();

        //variáveis necessárias para as operações básicas:
        double soma, sub, mult, div, resto;

        //cálculos
        soma = a + b;
        sub = a - b;
        mult = a * b;
        div = a / b;
        resto = a % b; //módulo => Resto da divisão

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
        System.out.println("Resto da divisão: " + resto);

        //Java respeita as operações matemáticas
        double conta = 3.0 * 4.0 - 5.0 / 2.0 + 1.0; //4,5? OU 10,5?
        System.out.println("Conta = " + conta); //10,5! Ufa!

        //para alterar a ordem, é preciso usar parenteses
        conta = ((((3.0 * 4.0) - 5.0) / 2.0) + 1.0);
        System.out.println("Conta = " + conta); //4m5

        conta = (3.0 * 4.0) - (5.0 / 2.0 + 1.0);
        System.out.println("Conta = " + conta); //8,5
    }

}
