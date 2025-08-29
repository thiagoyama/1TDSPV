package br.com.fiap.exemplo;

import br.com.fiap.model.ContaCorrente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        //Instanciar a classe ContaCorrente
        ContaCorrente cc = new ContaCorrente();

        Scanner leitor = new Scanner(System.in);
        int opcao = -1;
        do {
            try {
                System.out.println("Escolha: \n1-Depositar \n2-Retirar \n3-Exibir Saldo \n0-Sair");
                opcao = leitor.nextInt();
                switch (opcao) {
                    case 1:
                        //Depositar um valor na conta (usuário insere o valor)
                        System.out.println("Digite o valor para depositar");
                        double valor = leitor.nextDouble();
                        cc.depositar(valor);
                        break;
                    case 2:
                        //Retirar um valor da conta (usuário insere o valor)
                        System.out.println("Digite o valor para retirada");
                        valor = leitor.nextDouble();
                        cc.retirar(valor);
                        break;
                    case 3:
                        //Exibir o saldo
                        System.out.println("Saldo atual: " + cc.getSaldo());
                        break;
                    case 0:
                        System.out.println("Saindo do sistema");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } catch (InputMismatchException e){
                leitor.next();
                System.err.println("Valor inválido");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while(opcao != 0);

    }//main
}//class
