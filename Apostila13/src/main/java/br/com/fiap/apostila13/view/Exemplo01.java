package br.com.fiap.apostila13.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplo01 {

    //Conectar no banco de dados
    static void main(String[] args) {

        try {
            //Registrando o driver do banco de dados
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392", "izumi25");
            System.out.println("Conectado no banco de dados!");

            //Inserir um carro no BD
            Statement stm = conexao.createStatement();
            //Executar um comando SQL no banco de dados
            stm.executeUpdate("insert into tb_carro " +
                    "(id, ano, cor, modelo, valor, automatico)" +
                    "    values(2, 2025,'Prata', 'Kadet', 50000, 0)");

            System.out.println("Carro cadastrado!");
            //Fechar a conexão
            conexao.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC não encontrado " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Não foi possível conectar no banco de dados " + e.getMessage());
        }

    }//main

}//class
