package br.com.tinnova.core.desafios.fatorial;

import javax.swing.*;
import java.math.BigDecimal;


public class Fatorial {
    public static void main(String[] args) {


        String numero = JOptionPane.showInputDialog("Digite um numero qualquer");
        numero = numero.replaceAll("[^0-9]", "");

        BigDecimal numeroFatorial = new BigDecimal(numero);
        BigDecimal variavelTemporaria = numeroFatorial;
        BigDecimal valorFixo = numeroFatorial;

        if (numeroFatorial.equals(BigDecimal.ONE) || numeroFatorial.equals(BigDecimal.ZERO)) {
            JOptionPane.showMessageDialog(null, "O fatorial de " + numeroFatorial.intValue() + " é 1");
        } else {
            while (numeroFatorial.intValue() > 1) {
                variavelTemporaria = variavelTemporaria.multiply(numeroFatorial.subtract(BigDecimal.ONE));
                numeroFatorial = numeroFatorial.subtract(BigDecimal.ONE);
            }
            JOptionPane.showMessageDialog(null, "O Fatorial de " + valorFixo.intValue() + " é " + variavelTemporaria.intValue());
        }


    }
}
