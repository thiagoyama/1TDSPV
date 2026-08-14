package br.com.fiap.apostila12.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    static void main(String[] args) {
        //Ler um número que representa o andar com Scanner
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o andar da sala");
            int andar = leitor.nextInt();
            System.out.println("Você está no " + andar + "º andar");
        } catch (ArithmeticException e){
            System.out.println("Número inválido");
        } catch (Exception e){
            System.out.println("Operação inválida");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fechando os recursos");
            leitor.close();
        }

    }//main
}//class
