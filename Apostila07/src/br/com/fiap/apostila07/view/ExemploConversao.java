package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploConversao {

    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("Digite um numero");
        int n1 = Integer.parseInt(numero1);

        //Ler mais um numero
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        //Exibir a soma
        JOptionPane.showMessageDialog(null, "A soma é " + (n1 + n2));
    }
}
