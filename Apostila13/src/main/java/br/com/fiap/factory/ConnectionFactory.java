package br.com.fiap.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Fabrica de Conexões com o DB
public class ConnectionFactory {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //Registrar o driver do banco de dados
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //Obter a conexão com o banco de dados
        Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                "pf0392","fiap");

        return conexao;
    }

}
