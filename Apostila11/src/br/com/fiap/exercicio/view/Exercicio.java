package br.com.fiap.exercicio.view;

import br.com.fiap.exercicio.model.Aluno;

import java.util.*;

public class Exercicio {

    public static void main(String[] args) {
        //Criar um mapa de aluno
        Map<Integer, Aluno> mapaAluno = new HashMap<>();

        Scanner leitor = new Scanner(System.in);

        do {
            //Ler os dados dos alunos
            System.out.println("Digite o RM do aluno:");
            int rm = leitor.nextInt();

            System.out.println("Digite o nome do aluno");
            String nome = leitor.next() + leitor.nextLine();

            System.out.println("Digite a idade do aluno");
            int idade = leitor.nextInt();

            System.out.println("Digite a nota 1 do aluno");
            double nota1 = leitor.nextDouble();

            System.out.println("Digite a nota 2 do aluno");
            double nota2 = leitor.nextDouble();

            //Criar um aluno
            Aluno aluno = new Aluno(rm, nome, idade, nota1, nota2);

            //Adicionar no mapa o aluno
            mapaAluno.put(rm, aluno);

            //Perguntar se deseja adicionar mais alunos no mapa
            System.out.println("Deseja cadastrar mais aluno? S-Sim N-Não");
        } while(!leitor.next().equalsIgnoreCase("n"));

        //Recuperar todos os alunos (valores do mapa)
        Collection<Aluno> alunos = mapaAluno.values();

        //Exibir todos os alunos cadastrados
        for (Aluno a : alunos){
            System.out.println(a); //Na classe Aluno? implementar o toString()
        }

        //Exibir o total de alunos
        System.out.println("Total de alunos é: " + alunos.size());

        int somaIdades = 0;
        for (Aluno a : alunos){
            somaIdades += a.getIdade();
        }
        //Exibir a média de notas

        //Exibir a média de idade
        System.out.println("Média de idade dos alunos: " + somaIdades/alunos.size());

    }//main
}//class
