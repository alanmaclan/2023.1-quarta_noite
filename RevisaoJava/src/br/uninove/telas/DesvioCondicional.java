package br.uninove.telas;

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
        
        //desafio do tio: implemente a seguinte lógica:
        /**
         * 
         * Dada uma nota de um aluno verificar se ele foi aprovado ou não
         * A média para aprovação é 6
         * 
         * Se ele não foi aprovado, ele poderá realizar a DP se sua nota for 
         * até 4,5 (menor que isso, é dependência direto).
         * 
         * Na DP ele precisa tirar ao menos 7 para passar. 
         * 
         * */
 
         
    }
}
