package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.model.Carro;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ExemploPesquisaPorAno {

    static void main(String[] args) {
        //Ler o ano inicial e final
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ano incial");
        int inicio = leitor.nextInt();
        System.out.println("Digite o ano final");
        int fim = leitor.nextInt();

        try {
            //Pesquisar os carros por ano
            CarroDao dao = new CarroDao();
            //Exibir os carros da pesquisa
            List<Carro> lista = dao.buscarPorAno(inicio, fim);
            for (Carro c : lista)
                System.out.println(c);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
