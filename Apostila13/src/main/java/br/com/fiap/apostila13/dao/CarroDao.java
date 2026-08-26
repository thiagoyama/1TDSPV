package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

//DAO -> Data Access Object
//Classe responsável por realizar as ações no BD
public class CarroDao {

    private Connection conexao;

    public CarroDao() throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.getConnection();
    }

    //CRUD (Create, Read, Update, Delete)

    public void cadastrar(Carro carro) throws SQLException {
        //Criar o comando SQL de insert
        PreparedStatement stmt = conexao.prepareStatement("insert into tb_carro " +
                "(id, ano, cor, modelo, valor, automatico) values (?, ?, ?, ?, ?, ?)");
        //Atribuir os valores do carro (objeto) no comando SQL
        stmt.setInt(1, carro.getId());
        stmt.setInt(2, carro.getAno());
        stmt.setString(3, carro.getCor());
        stmt.setString(4, carro.getModelo());
        stmt.setDouble(5, carro.getValor());
        stmt.setBoolean(6, carro.isAutomatico());
        //Executar o comando SQL no Banco
        stmt.executeUpdate();
    }

    public Carro buscarPodId(int id){
        return null;
    }

    public List<Carro> listar(){
        return null;
    }

    public Carro atualizar(Carro carro){
        //Tarefa para SEXTA FEIRA!

        return null;
    }

    public void deletar(int id){

    }

}
