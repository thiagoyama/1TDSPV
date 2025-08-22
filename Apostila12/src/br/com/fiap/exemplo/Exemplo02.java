package br.com.fiap.exemplo;

import br.com.fiap.model.ContaCorrente;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        //Instanciar a classe ContaCorrente
        ContaCorrente cc = new ContaCorrente();

        Scanner leitor = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha: \n1-Depositar \n2-Retirar \n3-Exibir Saldo \n0-Sair");
            opcao = leitor.nextInt();

            //Depositar um valor na conta (usuário insere o valor)
            System.out.println("Digite o valor para depositar");
            double valor = leitor.nextDouble();
            cc.depositar(valor);

            //Exibir o saldo
            System.out.println("Saldo atual: " + cc.getSaldo());

            //Retirar um valor da conta (usuário insere o valor)
            System.out.println("Digite o valor para retirada");
            valor = leitor.nextDouble();
            cc.retirar(valor);

            //Exibir o saldo
            System.out.println("Saldo atual: " + cc.getSaldo());
        } while(opcao != 0);

    }//main
}//class
