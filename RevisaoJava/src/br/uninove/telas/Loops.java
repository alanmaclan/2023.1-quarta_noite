package br.uninove.telas;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        //System.out.println("1");
        //System.out.println("2");
        //System.out.println("3");
        //... isso é extremamente contraproduscente
        //FOR...:
        //imprimindo de 0 até 10
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("-----");

        //loop de 10 até 0:
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("-----");

        //WHILE
        int i = 0;
        while (i < 20) {
            System.out.println("While i...: " + i);
            //o while permite criar processos de interação definidos pelo desenvolvedor
            if (i % 2 == 0) {
                i++;
            } else {
                i += 3;
            }
        }

        System.out.println("-----");

        //DO..WHILE:
        int j = 0;
        //o do..while SEMPRE é executado ao menos uma vez!
        do {
            System.out.println("Do While - J = " + j);
            j++;
        } while (j <= 10);

        //Mini desafio para agora:
        /**
         * Pedir para o usuário digitar um valor entre 1 e 10. Assim que o valor
         * for validado, mostrar a tabuada deste número.
         *
         * Por exemplo:
         *
         * Entrada: 3
         *
         * Saída: 3 x 1 = 3 3 x 2 = 6 3 x 3 = 9 ... até o 10
         *
         * ATÉ 21.17
         */
        Scanner tec = new Scanner(System.in);
        int valor = -1;
        
        while (valor < 1 || valor > 10) {
            System.out.print("Informe o valor [1 - 10] para mostrar a tabuada: ");
            valor = tec.nextInt();
        }
        
        System.out.println("Mostrando a tabuada do " + valor + ".....:");
        
        for (int k = 1; k <= 10; k++) {
            System.out.println(valor + " x " + k + " = " + (valor * k));
        }
    }
}
