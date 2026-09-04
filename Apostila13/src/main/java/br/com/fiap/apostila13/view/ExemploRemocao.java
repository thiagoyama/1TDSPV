package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;

import java.util.Scanner;

public class ExemploRemocao {

    static void main(String[] args) {
        try {
            //Ler o código
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o código para remoção");
            int codigo = leitor.nextInt();
            //Instanciar o DAO
            CarroDao carroDao = new CarroDao();
            //Chamar o método para remoção
            carroDao.deletar(codigo);
            System.out.println("Carro removido!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }//main
}//class
