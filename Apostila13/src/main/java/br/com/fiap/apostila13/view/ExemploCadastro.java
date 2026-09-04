package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.model.Carro;

import java.util.Scanner;

public class ExemploCadastro {

    static void main(String[] args) {
        //Pedir para o usuário os dados do carro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano do carro");
        int ano = scanner.nextInt();
        System.out.println("Digite o modelo do carro");
        String modelo = scanner.next() + scanner.nextLine();
        System.out.println("Digite a cor do carro");
        String cor = scanner.next() + scanner.nextLine();
        System.out.println("Digite o valor do carro");
        double valor = scanner.nextDouble();
        System.out.println("É automático? true/false");
        boolean automatico = scanner.nextBoolean();
        //Instanciar o carro com os dados
        Carro carro = new Carro(ano, cor, modelo, valor, automatico);
        try {
            //Instanciar o DAO
            CarroDao dao = new CarroDao();
            //Chamar o método de cadastro do DAO
            dao.cadastrar(carro);
            System.out.println("Carro cadastrado!");
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }//main
}//class
