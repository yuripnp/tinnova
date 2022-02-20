package br.com.tinnova.core.desafios.multiplo;

import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args) {
        Integer tresMultiplo = 3;
        Integer cincoMultiplo = 5;
        Integer somaTres = 0;
        Integer somaCinco = 0;
        Integer total = 0;

        System.out.print("Digite um valor: ");
        Scanner valorInserido = new Scanner(System.in);
        String valorString = valorInserido.nextLine();

        valorString = valorString.replaceAll("[^0-9]", "");

        try {
            Integer valor = Integer.parseInt(valorString);
            for (int i = 0; i <= valor; i++) {
                if (i % 3 == 0) {
                    somaTres = somaTres + i;
                }
                if (i % 5 == 0) {
                    somaCinco = somaCinco + i;
                }
                total = total + (somaCinco + somaTres);

            }
            System.out.println("A soma dos multiplos de " + tresMultiplo + " e " + cincoMultiplo + " do valor " + valorString + " é de " + total);
        } catch (NumberFormatException ex) {
            System.err.println("Formato de valor inválido " + ex);
        } finally {
            valorInserido.close();
        }


    }


}
