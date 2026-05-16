package br.com.fiap.portal.view;

import br.com.fiap.portal.model.Aluno;
import br.com.fiap.portal.model.Endereco;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Ler os dados do Aluno
        System.out.println("Informe o nome");
        String nome = leitor.next() + leitor.nextLine();
        System.out.println("Informe o cpf");
        String cpf = leitor.next() + leitor.nextLine();
        System.out.println("Informe a idade");
        int idade = leitor.nextInt();
        System.out.println("Informe o rm");
        int rm = leitor.nextInt();
        System.out.println("Informe o curso");
        String curso = leitor.next() + leitor.nextLine();
        //Ler os dados do endereço
        System.out.println("Informe o logradouro");
        String logradouro = leitor.next() + leitor.nextLine();
        System.out.println("Informe o numero");
        String numero = leitor.next() + leitor.nextLine();

        //Atribuir os dados no objeto Aluno
        Endereco endereco = new Endereco(logradouro, numero); //Criar o construtor na classe Endereço
        Aluno aluno = new Aluno(nome, cpf, idade, endereco, rm, curso);
//        aluno.setCpf(cpf);
//        aluno.setNome(nome);
//        aluno.setCurso(curso);
//        aluno.setRm(rm);
//        aluno.setIdade(idade);
//        aluno.setEndereco(endereco);

        //Exibir os dados do objeto
        System.out.println(aluno.getNome() + ", idade: " + aluno.getIdade() + ", cpf: " + aluno.getCpf());
        System.out.println("RM: " + aluno.getRm() + ", curso: " + aluno.getCurso());
        //Exibir os dados do endereço do aluno
        System.out.println("Endereço: " + aluno.getEndereco().getLogradouro() + ", " + aluno.getEndereco().getNumero());

    }//main
}//class
