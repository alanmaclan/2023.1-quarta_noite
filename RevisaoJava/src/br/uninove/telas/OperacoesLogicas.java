package br.uninove.telas;

public class OperacoesLogicas {

    public static void main(String[] args) {
        //operações lógicas:

        // & => e comercial (AND)
        // | => "pipe" (OU)
        System.out.println(1 == 2); //comparação (false)
        System.out.println(1 != 2); //diferente (true)
        System.out.println(1 >= 2); //maior ou igual (false)
        System.out.println(2 >= 2); //(true)
        System.out.println(3 <= 4); //menor ou igual (true)
        System.out.println(10 > 100); //maior (false)
        System.out.println(10 < 100); //menor (true)
        //...

        //tabela verdade com, por exemplo, duas variáveis...
        boolean a = false;
        boolean b = true;
        System.out.println(a && b); //ambos precisam ser verdadeiros
        System.out.println(a || b); //basta um deler ser verdadeiro

        boolean c = true;
        System.out.println(a || b && c); //true

        System.out.println("C = " + c);
        System.out.println("C agora é igual a " + !c); //! = operador "not" (inverte um valro booleano)
    }
}
