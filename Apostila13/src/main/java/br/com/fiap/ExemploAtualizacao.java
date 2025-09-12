package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploAtualizacao {

    public static void main(String[] args) {
        try {
            //Obter a conexão com o banco dados
            Connection churros = ConnectionFactory.getConnection();
            //Obter um Statement
            Statement stm = churros.createStatement();
            //Executar o comando SQL
            stm.executeUpdate("update t_produto " +
                    "set vl_produto = 1000 where cd_produto = 1");

            System.out.println("Produto atualizado");
            //Fechar a conexão
            churros.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
