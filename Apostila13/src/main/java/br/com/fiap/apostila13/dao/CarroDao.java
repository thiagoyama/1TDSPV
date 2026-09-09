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
                "(id, ano, cor, modelo, valor, automatico) values (sq_tb_carro.nextval, ?, ?, ?, ?, ?)", new String[] {"id"});
        //Atribuir os valores do carro (objeto) no comando SQL
        stmt.setInt(1, carro.getAno());
        stmt.setString(2, carro.getCor());
        stmt.setString(3, carro.getModelo());
        stmt.setDouble(4, carro.getValor());
        stmt.setBoolean(5, carro.isAutomatico());
        //Executar o comando SQL no Banco
        stmt.executeUpdate();
        //Recuperar o ID gerado pela sequence
        ResultSet resultSet = stmt.getGeneratedKeys();
        if (resultSet.next()){
            int codigo = resultSet.getInt(1);
            carro.setId(codigo);
        }
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
        return getCarro(resultSet);
    }

    private static Carro getCarro(ResultSet resultSet) throws SQLException {
        String modelo = resultSet.getString("modelo");
        double valor = resultSet.getDouble("valor");
        int ano = resultSet.getInt("ano");
        String cor = resultSet.getString("cor");
        boolean automatico = resultSet.getBoolean("automatico");
        int id = resultSet.getInt("id");
        //Criar o objeto produto com os valores e retornar
        return new Carro(id, ano, cor, modelo, valor, automatico);
    }

    public List<Carro> listar() throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("select * from tb_carro");
        ResultSet resultSet = stmt.executeQuery();
        //Criar a lista de Carro
        List<Carro> lista = new ArrayList<>();
        //Percorrer todas as linhas retornadas da Query
        while (resultSet.next()) {
            lista.add(getCarro(resultSet));
        }
        //Retornar a lista
        return lista;
    }

    public Carro atualizar(Carro carro) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o PreparedStatement com o comando SQL
        PreparedStatement stmt = conexao.prepareStatement("update tb_carro set ano = ?, cor = ?, modelo = ?, " +
                "valor = ?, automatico = ? where id = ?");
        //Setar os valores no comando SQL
        stmt.setInt(1, carro.getAno());
        stmt.setString(2, carro.getCor());
        stmt.setString(3, carro.getModelo());
        stmt.setDouble(4, carro.getValor());
        stmt.setBoolean(5, carro.isAutomatico());
        stmt.setInt(6, carro.getId());
        //Executar o comando SQL
        int linhas = stmt.executeUpdate(); //Retorna a quantidade de linhas afetadas no BD
        if (linhas == 0)
            throw new EntidadeNaoEncontradaException("Carro não existe para atualização");
        return carro;
    }

    public void deletar(int id) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stmt = conexao.prepareStatement("delete from tb_carro where id = ?");
        stmt.setInt(1, id);
        int linhas = stmt.executeUpdate();
        if (linhas == 0)
            throw new EntidadeNaoEncontradaException("Carro não encontrado para remoção");
    }

    public List<Carro> buscarPorAno(int anoInicial, int anoFinal) throws SQLException {
        PreparedStatement stmt = conexao
                .prepareStatement("select * from tb_carro where ano BETWEEN ? and ?");
        stmt.setInt(1, anoInicial);
        stmt.setInt(2, anoFinal);
        ResultSet resultSet = stmt.executeQuery();
        List<Carro> lista = new ArrayList<>();
        while (resultSet.next()){
            lista.add(getCarro(resultSet));
        }
        return lista;
    }

}
