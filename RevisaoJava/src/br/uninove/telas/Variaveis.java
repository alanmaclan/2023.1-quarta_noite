package br.uninove.telas;

public class Variaveis {

    public static void main(String[] args) {
        //principais tipos de variáveis:
        //vide: https://www.w3schools.com/java/java_data_types.asp

        int idade = 35; //inteira
        String nome = "Thiago Traue"; //texto
        float altura = 1.90f; //números de ponto flutuante
        double salario = 2313213131131.431231; //número de ponto flutuante com maior alocação de memória
        char sexo = 'J'; //para um único caracter
        boolean fumante = false; //para variáveis verdadeiras (true) ou falsas (false)

        System.out.println("Meu nome é " + nome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.printf("Tenho %.2f m de altura\n", altura);
        System.out.println("Eu recebo R$" + salario + " como professor. Só que não!");
        System.out.println("Me identifico como sexo " + sexo);
        System.out.println("Sou fumante? " + fumante);
    }

}
