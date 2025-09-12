package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploCadastro {

    public static void main(String[] args) {

        try {
            Connection conexao = ConnectionFactory.getConnection();

            System.out.println("Conectado com sucesso!");

            //Criar um objeto Statement
            Statement stm = conexao.createStatement();

            //Inserir um produto no banco de dados
            stm.executeUpdate("insert into t_produto (cd_produto, nm_produto, ds_produto, vl_produto) " +
                    "values (2, 'Livro Java Como Programar', 'Livro para aprender a programar Java', 250.50)");

            System.out.println("Cadastrado com sucessso");

            //Fecha a conexão
            conexao.close();
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }//main
}//class
