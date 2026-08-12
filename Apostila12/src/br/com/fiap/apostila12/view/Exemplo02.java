package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.model.Turma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {

    static void main(String[] args) {
        //Instanciar uma Turma
        Turma turma = new Turma();
        //Pedir para a sala da turma
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Qual a sala?");
            int sala = leitor.nextInt();

            //Adicionar a sala na turma
            turma.alterarSala(sala);

            //Exibir a sala da turma
            System.out.println("Sala da turma: " + turma.getSala());
        } catch (InputMismatchException e) {
            System.out.println("Número inválido");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } finally {
            leitor.close();
        }
    }//main
}//class
