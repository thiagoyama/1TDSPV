package br.com.fiap.exemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo04 {

    public static void main(String[] args) {
        //Mapa (Chave e Valor)
        Map<String, String> paises = new HashMap<>();

        //Adicionar 4 paises (chave é o pais, valores é a capital)
        paises.put("Ilhas Faroé", "Tórshavan");
        paises.put("Belgica", "Bruxelas");
        paises.put("Bolivia", "La Paz");
        paises.put("Canada", "Ottawa");

        //Exibir a quantidade de valores no mapa
        System.out.println("TOTAL: " + paises.size());

        //Exibir todos as chaves e valores
        //Recuperar todas as chaves do mapa
        Set<String> chaves = paises.keySet();
        //Percorrer as chaves
        for (String chave : chaves){
            System.out.println("A capital do(a) " + chave + " é " + paises.get(chave));
        }
    }
}
