package br.com.fiap.exemplo;

import br.com.fiap.model.Fruta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        //Criar uma lista de frutas
        List<Fruta> frutas = new ArrayList<>();

        //Pedir para o usuario os valores: nome, cor e preço da fruta
        Scanner leitor = new Scanner(System.in);

        //Variavel de controle do menu
        int opcao = -1; // 1 - Cadastrar, 2 - Listar, 0 - Sair

        while (opcao != 0) {
            //Ler a opção do usuário
            System.out.println("Escolha: \n1-Cadastrar \n2-Listar \n3-Remover \n4-Exibir total de frutas \n0-Sair");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o nome da fruta");
                String nome = leitor.next() + leitor.nextLine();

                System.out.println("Digite a cor da fruta");
                String cor = leitor.next() + leitor.nextLine();

                System.out.println("Digite o preço da fruta");
                double preco = leitor.nextDouble();

                //Criar uma instancia da fruta com os valores do usuario
                Fruta fruta = new Fruta(nome, cor, preco);

                //Adicionar a fruta na lista
                frutas.add(fruta);
            } else if (opcao == 2) {
                System.out.println("*********** FRUTAS *****************");
                //Exibir todas as frutas da lista (for)
                for (int i = 0; i < frutas.size(); i++) {
                    System.out.println(i + " - " + frutas.get(i));
                }
            } else if (opcao == 3){
                System.out.println("Digite a posição da fruta que será removida");
                int posicao = leitor.nextInt();
                frutas.remove(posicao);
            } else if (opcao == 4){
                System.out.println("Total: " + frutas.size());
            }
        }
        System.out.println("Finalizando o programa..");
        leitor.close();
    }
}
