package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicao {

    public static void main(String[] args) {
        //Ler a quantidade de alunos da sala (JOptionPane)
        String qtdStr = JOptionPane.showInputDialog("Digite a quantidade de alunos");
        int qtd = Integer.parseInt(qtdStr);

        //Dizer se é possivel aplicar uma prova em dupla
        if (qtd % 2 == 0) {
            JOptionPane.showMessageDialog(null, "É possível realizar a avalição em dupla");
        } else{
            JOptionPane.showMessageDialog(null, "Não é possível realizar a avaliação em dupla");
        }

    }//main
}//class
