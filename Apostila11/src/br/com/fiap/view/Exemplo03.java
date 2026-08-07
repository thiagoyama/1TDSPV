package br.com.fiap.view;

import br.com.fiap.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Exemplo03 {

    static void main(String[] args) {
        //Criar uma lista de veiculos
        List<Veiculo> veiculos = new ArrayList<>();

        //Criar 3 veiculos
        Veiculo celta = new Veiculo("ABC1234", 2012, "Celta");
        Veiculo kadett = new Veiculo("KD1234", 1990, "Kadett");
        Veiculo golf = new Veiculo("KAD-1233", 2020, "Golf");

        //Adicionar os 3 veiculos na lista
        veiculos.add(celta);
        veiculos.add(kadett);
        veiculos.add(golf);

        //Adicionar um veiculo na lista sem criar uma variável
        veiculos.add(new Veiculo("GWM12345", 2026, "Kait"));
        veiculos.add(celta);

        //Recuperar o segundo veiculo da lista e exibir os dados
        Veiculo segundoVeiculo = veiculos.get(1);
        System.out.println(segundoVeiculo);

        System.out.println("Com for:");
        //Exibir todos os veiculos na ordem de inserção (laço de repetição)
        for (int i = 0; i < veiculos.size(); i++){
            System.out.println((i + 1) + " - " + veiculos.get(i));
        }

        System.out.println("Com foreach:");
        for (Veiculo churros : veiculos){
            System.out.println(churros);
        }
    }
}
