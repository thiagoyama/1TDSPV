package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.model.Carro;

import java.util.Scanner;

public class ExemploAtualizacao {

    static void main(String[] args) {
        //Ler os dados do carro
        try {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o código");
            int codigo = leitor.nextInt();
            System.out.println("Digite o modelo");
            String modelo = leitor.next() + leitor.nextLine();
            System.out.println("Digite a cor");
            String cor = leitor.next() + leitor.nextLine();
            System.out.println("Digite o ano");
            int ano = leitor.nextInt();
            System.out.println("Digite o valor");
            double valor = leitor.nextDouble();
            System.out.println("É automático? (true/false)");
            boolean automatico = leitor.nextBoolean();
            //Instanciar o CarroDAO
            CarroDao carroDao = new CarroDao();
            //Chamar o atualizar do DAO
            Carro carro = new Carro(codigo, ano, cor, modelo, valor, automatico);
            carroDao.atualizar(carro);
            System.out.println("Carro atualizado!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//main
}//class
