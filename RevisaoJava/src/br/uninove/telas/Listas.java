package br.uninove.telas;

public class Listas {

    public static void main(String[] args) {

        //A lista, em Java e por enquanto, deve ser ser de um determinado TIPO
        String compras[] = {"Ovos", "Leite", "Banana", "Alface"};

        //a lista pode ser desordenada, mas deve-se respeitar o tipo em todas as poisções
        int idades[] = {18, 19, 17, 21, 35, 89, 22, 18};

        for (int i = 0; i < compras.length; i++) {
            System.out.println("Item da lista: " + compras[i]);
        }

        //paramos aqui...
    }
}
