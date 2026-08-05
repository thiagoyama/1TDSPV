package br.com.fiap.view;

import java.util.HashSet;
import java.util.Set;

public class Exemplo01 {

    static void main(String[] args) {
        //Variável para gravar o nome da turma
        String nomeTurma = "1TDSPV";

        //Variável para gravar o nome dos alunos da turma
        Set<Integer> rmAlunos = new HashSet<>();
        //Adicionar um RM na lista
        rmAlunos.add(570983);
        //Exibir a quantidade de elementos da lista
        System.out.println("A quantidade de rms é " + rmAlunos.size());

    }
}
