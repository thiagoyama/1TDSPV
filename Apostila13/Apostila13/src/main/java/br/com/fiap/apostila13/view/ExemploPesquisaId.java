package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.CarroDao;
import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.model.Carro;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploPesquisaId {

    static void main(String[] args) {
        //Pedir o ID do carro
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o código do carro");
            int codigo = leitor.nextInt();
            CarroDao carroDao = new CarroDao();
            //Pesquisar o Carro no Banco
            Carro carro = carroDao.buscarPodId(codigo);
            //Exibir os dados do Carro, se existir
            System.out.println(carro);
        } catch (InputMismatchException e){
            System.err.println("Número inválido");
        } catch (SQLException |EntidadeNaoEncontradaException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Projeto sem JDBC");
        }
    }//main
}//class
