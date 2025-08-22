package br.com.fiap.exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            //Ler dois números (usuário vai digitar dois números inteiros)
            System.out.println("Digite um número");
            int n1 = leitor.nextInt();

            System.out.println("Digite outro número");
            int n2 = leitor.nextInt();

            //Dividir um número pelo outro
            int divisao = n1/n2;

            //Exibir o resultado da divisão
            System.out.println("O resultado é " + divisao);

        } catch (InputMismatchException e){
            //Tratamento da exception
            System.err.println("Digite um valor válido da próxima vez");
        } catch (ArithmeticException e) {
            System.err.println("Não é possível realizar a divisão por zero");
        } finally {
            System.out.println("Trecho de código que sempre executa");
        }

    }//main
}//class
