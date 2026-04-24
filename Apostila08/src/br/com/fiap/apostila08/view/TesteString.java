package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString {

    public static void main(String[] args) {
        System.out.println("\t FIAP \n Faculdade de \"São Paulo\"");

        String endereco = JOptionPane.showInputDialog("Digite o endereço");

        String endereco1 = JOptionPane.showInputDialog("Digite outro endereco");

        //Comparar se os endereços são iguais
        //iqualsIgnoreCase -> compara ser diferenciar as maiusculas das minusculas (FIap == fiap)
        //iguals -> compara diferenciado as maisculas das minusculas (Fiap != fiap)
        if (endereco.equalsIgnoreCase(endereco1)){
            JOptionPane.showMessageDialog(null, "Os endereços são iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Os endereços são diferentes");
        }

        //Dizer quantos caracteres tem o endereço
        JOptionPane.showMessageDialog(null, "O endereço possui: " + endereco.length());

        //Recuperar o caractere da posição 3 do endereço
        JOptionPane.showMessageDialog(null, "O caractere da 3º posição é: " + endereco.charAt(2));

        //Imprimir o endereço na vertical
        for (int i=0; i< endereco.length(); i++)
            System.out.println(endereco.charAt(i));

    }
}

