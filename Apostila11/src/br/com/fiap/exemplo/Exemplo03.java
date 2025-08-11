package br.com.fiap.exemplo;

import java.util.HashSet;
import java.util.Set;

public class Exemplo03 {

    public static void main(String[] args) {
        //Criar um conjunto de placa de carro
        Set<String> placas = new HashSet<>();

        //Adicionar placas no conjunto
        placas.add("ABC-1234");
        placas.add("ABC1F43");
        //Adicionar uma placa igual
        placas.add("ABC-1234");

        //Exibir o total de placas
        System.out.println("TOTAL: " + placas.size());

        //Exibir as placas cadastradas
        for (String churros : placas){
            System.out.println(churros);
        }

    }
}
