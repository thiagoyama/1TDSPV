package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public Carro buscarPodId(int id) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stmt = conexao.
                prepareStatement("select * from tb_carro where id = ?");
        stmt.setInt(1, id);
        ResultSet resultSet = stmt.executeQuery();
        //validar se existe o carro com o id pesquisado
        if (!resultSet.next()) //Se existir um elemento, posiciona o cursor e retorna true
            throw new EntidadeNaoEncontradaException("Carro não encontrado");
        //Recuperar os dados do Carro do resultado do SQL
        String modelo = resultSet.getString("modelo");
        double valor = resultSet.getDouble("valor");
        int ano = resultSet.getInt("ano");
        String cor = resultSet.getString("cor");
        boolean automatico = resultSet.getBoolean("automatico");

        //Criar o objeto produto com os valores e retornar
        return new Carro(id,ano, cor, modelo, valor, automatico);
    }

    public List<Carro> listar() throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("select * from tb_carro");
        ResultSet resultSet = stmt.executeQuery();
        //Criar a lista de Carro
        List<Carro> lista = new ArrayList<>();
        //Percorrer todas as linhas retornadas da Query
        while (resultSet.next()) {
            //Ler os dados das colunas
            String modelo = resultSet.getString("modelo");
            double valor = resultSet.getDouble("valor");
            int ano = resultSet.getInt("ano");
            String cor = resultSet.getString("cor");
            boolean automatico = resultSet.getBoolean("automatico");
            int id = resultSet.getInt("id");
            //Criar o carro e adicionar na lista
            lista.add(new Carro(id,ano, cor, modelo, valor, automatico));
        }
        //Retornar a lista
        return lista;
    }

    public Carro atualizar(Carro carro){
        //Tarefa para SEXTA FEIRA!

        return null;
    }

    public void deletar(int id){

    }

}
