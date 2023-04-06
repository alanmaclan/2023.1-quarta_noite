package br.uninove.telas;

import java.util.Scanner;

public class DesvioCondicional {

    public static void main(String[] args) {

        boolean fumante = false;

        //o desvio condicional mais simples que existe é o if..else:
        if (fumante) {
            System.out.println("É fumante...");
        } else {
            System.out.println("Não fuma!");
        }

        int idade = 16;

        if (idade < 18) {
            System.out.println("Não pode dirigir");
        } else if (idade >= 21) {
            System.out.println("Pode diritir e já está na maioridade penal");
        } else {
            System.out.println("Pode dirigir");
        }

        //Desvio condicional com switch..case
        char sexo = 'J';

        switch (sexo) {
            case 'F':
                System.out.println("Menina");
                break;
            case 'M':
                System.out.println("Menino");
                break;
            case 'I':
                System.out.println("Indefinido");
                break;
            case 'N':
                System.out.println("Neutro");
                break;
            default:
                System.out.println("Outro");
                break;
        }

        //desafio do tio: implemente a seguinte lógica:
        /**
         *
         * Dada uma nota de um aluno verificar se ele foi aprovado ou não A
         * média para aprovação é 6
         *
         * Se ele não foi aprovado, ele poderá realizar a DP se sua nota for até
         * 4,5 (menor que isso, é dependência direto).
         *
         * Na DP ele precisa tirar ao menos 7 para passar.
         *
         *
         */
        //Solução
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nota do aluno: ");
        float notaFinal = sc.nextFloat();

        if (notaFinal >= 6) {
            System.out.println("Aprovado!");
            return;
        }

        if (notaFinal >= 4.5) {
            System.out.println("Reprovado, mas com direiro a DP...");
            System.out.print("Informe a nota da DP: ");
            float notaDP = sc.nextFloat();
            if (notaDP >= 7) {
                System.out.println("Aprovado");
                return;
            }
        }
        System.out.println("Reprovado");
    }

}
