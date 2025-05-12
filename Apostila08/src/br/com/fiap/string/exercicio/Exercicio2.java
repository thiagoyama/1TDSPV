package br.com.fiap.string.exercicio;

import javax.print.attribute.standard.JobSheets;
import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {
        //Ler a palavra
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");

//        String vogais = "aeiou";
//        for (int i=0; i < vogais.length(); i++) {
//            //Trocar as vogais por *
//            palavra = palavra.replace(vogais.charAt(i), '*');
//        }

        palavra = palavra.replaceAll("[aeiou]", "*");

        //Exibir a palavra modificada
        JOptionPane.showMessageDialog(null, palavra);

    }
}
