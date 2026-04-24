package br.com.fiap.apostila07.view;

import javax.swing.*;

public class TesteTamanho {

    //Crie uma classe TesteTamanho em Java que peça o nome, a altura e o peso de 2
    //pessoas e apresente o nome da mais pesada e o nome da mais alta.
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa");
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da primeira pessoa"));
        double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da primeira pessoa"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa");
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da segunda pessoa"));
        double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da segunda pessoa"));

        if (peso1 > peso2){
            JOptionPane.showMessageDialog(null, nome1 + " é mais pesado com " + peso1);
        } else if (peso2 > peso1){
            JOptionPane.showMessageDialog(null, nome2 + " é mais pesado com " + peso2);
        } else {
            JOptionPane.showMessageDialog(null, nome1 + " e " + nome2 + " possuem o mesmo peso");
        }

        if (altura1 > altura2){
            JOptionPane.showMessageDialog(null, nome1 + " é mais alto(a) com " + altura1);
        } else if (altura2 > altura1) {
            JOptionPane.showMessageDialog(null, nome2 + " é mais alto(a) com " + altura2);
        } else {
            JOptionPane.showMessageDialog(null, nome1 + " e " + nome2 + " possuem a mesma altura");
        }

    }
}
