package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicaoEncadeada {

    public static void main(String[] args) {
        //Ler a média final do aluno
        String mediaStr = JOptionPane.showInputDialog("Digite a média final");
        double media = Double.parseDouble(mediaStr);

        if (media >=6) {
            JOptionPane.showMessageDialog(null, "Aprovado!");
        } else if (media >=4) {
            JOptionPane.showMessageDialog(null, "Exame!");
        } else {
            JOptionPane.showMessageDialog(null, "Retido");
        }

    }//main
}//class
