package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploPesquisa {

    public static void main(String[] args) {
        try {
            //Obter a conexão
            Connection conexao = ConnectionFactory.getConnection();
            //Statement
            Statement stm = conexao.createStatement();
            //Executar o comando
            ResultSet rs =
                    stm.executeQuery("select * from t_produto");
            //Recuperar os dados do banco para exibir
            while (rs.next()){
                int codigo = rs.getInt("cd_produto");
                String nome = rs.getString("nm_produto");
                String descricao = rs.getString("ds_produto");
                double valor = rs.getDouble("vl_produto");
                System.out.println(codigo + " " + nome + " " + descricao + " " + valor);
            }
            //Fechar a conexão
            conexao.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }//main
}//class
