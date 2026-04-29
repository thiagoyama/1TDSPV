package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString2 {

    public static void main(String[] args) {
        //Ler um e-mail do usuário
        String email = JOptionPane.showInputDialog("Digite seu e-mail");

        //Valida se o e-mail é válido (se tem @ e .)
        int posicao = email.indexOf("@");
        int posicao2 = email.indexOf(".");
        //thiago@fiap.com.br -> 6
        //thiago -> -1
        if (posicao != -1 && posicao2 != -1){
            System.out.println("E-mail válido");
        } else {
            System.out.println("E-mail inválido");
        }

        //Separar o email do dominio
        //thiago@fiap.com.br -> e = thiago; dominio = fiap.com.br;
        String e = email.substring(0, posicao);
        String dominio = email.substring(posicao + 1);
        System.out.println(e);
        System.out.println(dominio);

    }//main
}//class
