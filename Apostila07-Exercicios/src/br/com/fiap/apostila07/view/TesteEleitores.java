package br.com.fiap.apostila07.view;

import javax.print.attribute.standard.JobSheets;
import javax.swing.*;

public class TesteEleitores {

    //Crie uma classe TesteEleitores que leia a idade de 3 pessoas e informe a sua
    //classe eleitoral:
    //• não eleitor (abaixo de 16 anos)
    //• eleitor obrigatório (entre 18 e 65 anos)
    //• eleitor facultativo (16 , 17 anos ou maior que 65 anos)
    //Ao final da execução exibir o total de eleitores obrigatórios.
    public static void main(String[] args) {
        int eleitoresObrigatorios = 0;
        for (int i = 1; i < 4; i++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + i));
            if (idade < 16)
                JOptionPane.showMessageDialog(null, "Não eleitor");
            else if (idade >= 18 && idade <= 65) {
                JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
                eleitoresObrigatorios++;
            } else
                JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        }//for
        JOptionPane.showMessageDialog(null, "Eleitores obrigatórios: " + eleitoresObrigatorios);
    }//main
}//class
