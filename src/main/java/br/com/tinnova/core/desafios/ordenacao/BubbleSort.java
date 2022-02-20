package br.com.tinnova.core.desafios.ordenacao;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
        int aux = 0;

        System.out.println("-------------------- desordenado ----------------------");

        for(int i = 0; i < 8; i++) {
            System.out.println(" " + vetor[i]);
        }

        System.out.println("------------------ Ordenação ----------------------------");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        for(int i = 0; i < 8; i++) {
            System.out.println(" " + vetor[i]);
        }
    }

}
