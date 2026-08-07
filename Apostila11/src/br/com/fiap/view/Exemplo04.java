package br.com.fiap.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo04 {

    static void main(String[] args) {
        //Criar um mapa de armario (numero do armario, conteúdo do armario)
        Map<Integer, String> armario = new HashMap<>();

        //Adicionar roupas no armario
        armario.put(12, "Camiseta Branca");
        armario.put(5, "Blusa azul");
        armario.put(9, "Calça");

        //Recuperar o valor da chave 5
        System.out.println("Elemento da chave 5: " + armario.get(5));

        //Recuperar o valor da chave 10
        System.out.println("Elemento da chave 10: " + armario.get(10));

        //Adicionar um valor na chave 12
        armario.put(12, "Camisa Polo");

        //Exibir a quantidade de elementos no mapa
        System.out.println("Quantidade de elementos: " + armario.size());

        //Exibir todas as chaves e valores do mapa
        System.out.println("Elementos do Mapa:");
        Set<Integer> chaves = armario.keySet(); //Retornar todas as chaves
        for (Integer chave : chaves){
            System.out.println(chave + " : " + armario.get(chave));
        }

    }
}
