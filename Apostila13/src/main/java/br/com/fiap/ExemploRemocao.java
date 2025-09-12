package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploRemocao {

    public static void main(String[] args) {
        try {
            //Obter a conexão com o banco
            Connection conexao = ConnectionFactory.getConnection();
            //Obter o Statement
            Statement stm = conexao.createStatement();
            //Executar o comando SQL
            stm.executeUpdate("delete from t_produto " +
                    "where cd_produto = 1");
            //Fechar a conexão
            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }//main
}//class
