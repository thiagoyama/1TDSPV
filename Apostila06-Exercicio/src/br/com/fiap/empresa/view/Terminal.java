package br.com.fiap.empresa.view;

import br.com.fiap.empresa.model.Funcionario;
import br.com.fiap.empresa.model.Profissao;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Pedir para o usuario inserir os valores
        System.out.println("Digite o nome:");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a matricula");
        long matricula = leitor.nextLong();

        System.out.println("Digite o salario");
        double salario = leitor.nextDouble();

        System.out.println("Digite a profissao");
        String nomeProfissao = leitor.next() + leitor.nextLine();

        //Instanciar a classe Profissao e Funcionario
        Funcionario f = new Funcionario(matricula, nome, new Profissao(nomeProfissao));
        f.setSalario(salario);

        //Exibir os dados (chamando o método exibir dados)
        System.out.println(f.exibirDados());

    }
}
