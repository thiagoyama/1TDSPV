package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aluno;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Ler os dados do aluno
        System.out.println("Digite o nome do aluno:");
        String nome = entrada.next() + entrada.nextLine();

        System.out.println("Digite a nota da CP1");
        double cp1 = entrada.nextDouble();

        System.out.println("Digite a nota da CP2");
        double cp2 = entrada.nextDouble();

        System.out.println("Digite a nota da Sprint 1");
        double sprint1 = entrada.nextDouble();

        System.out.println("Digite a nota da Sprint 2");
        double sprint2 = entrada.nextDouble();

        System.out.println("Digite a nota da GS");
        double gs = entrada.nextDouble();

        //Criar o objeto aluno
        Aluno aluno = new Aluno();
        aluno.nome = nome;
        aluno.cp1 = cp1;
        aluno.cp2 = cp2;
        aluno.sprint1 = sprint1;
        aluno.sprint2 = sprint2;
        aluno.gs = gs;

        //Atribuir os valores aos atributos do objeto aluno
        double media = aluno.calcularMedia();
        //Calcular e exibir a média
        System.out.println("Média do aluno " + aluno.nome + " é " + media);
    }
}
