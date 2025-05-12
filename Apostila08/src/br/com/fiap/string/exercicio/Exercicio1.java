package br.com.fiap.string.exercicio;

import javax.swing.*;

public class Exercicio1 {

    public static void main(String[] args) {
        //Ler uma palavra
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");

        //Transformar em maiusculo
        String novaPalavra = palavra.toUpperCase();

        //Exibir a palavra
        System.out.println(novaPalavra);
        JOptionPane.showMessageDialog(null, novaPalavra);

    }
}
