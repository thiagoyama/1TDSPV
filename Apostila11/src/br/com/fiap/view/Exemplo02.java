package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

    static void main(String[] args) {
        //Criar uma lista de nome dos alunos
        List<String> nomeAlunos = new ArrayList<>();

        //Adicionar 2 nomes
        nomeAlunos.add("Douglas");
        nomeAlunos.add("Maria");

        //Verificar se existe nomes na lista
        if (nomeAlunos.isEmpty())
            System.out.println("A lista está vazia");
        else
            System.out.println("A lista contem nomes");

        //Exibir a quantidade
        System.out.println("Nomes na lista: " + nomeAlunos.size());

        //Validar se o Douglas está na lista?
        if (nomeAlunos.contains("Douglas"))
            System.out.println("Douglas está na lista");
        else
            System.out.println("Douglas não está na lista");

        //Recuperar o aluno da primeira posição
        System.out.println(nomeAlunos.get(0));

        //Exibir todos os alunos da lista
        System.out.println(nomeAlunos);

    }
}
