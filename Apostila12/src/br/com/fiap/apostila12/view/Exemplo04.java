package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.model.ContaCorrente;

import java.util.Scanner;

public class Exemplo04 {

    static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        Scanner leitor = new Scanner(System.in);
        try {
            //Pedir para o usuário o valor para depósito
            System.out.println("Digite o valor para depósito");
            double valor = leitor.nextDouble();
            cc.depositar(valor);
            //Exibir o valor do saldo
            System.out.println("Saldo atual: " + cc.getSaldo());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            leitor.close();
        }
    }
}
