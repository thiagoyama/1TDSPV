package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Montadora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MontadoraDao {

    private Connection conexao;

    public MontadoraDao() throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar(Montadora montadora) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("insert into " +
                "tb_montadora (id, cnpj, nome) values (sq_tb_montadora.nextval, ?, ? )", new String[]{"id"});
        stmt.setString(1, montadora.getCnpj());
        stmt.setString(2, montadora.getNome());
        stmt.executeUpdate();
        ResultSet resultSet = stmt.getGeneratedKeys();
        if (resultSet.next())
            montadora.setId(resultSet.getInt(1));
    }

    public Montadora buscarPorId(int id) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stmt = conexao.prepareStatement("select * from tb_montadora where id = ?");
        stmt.setInt(1, id);
        ResultSet resultSet = stmt.executeQuery();
        if (!resultSet.next())
            throw new EntidadeNaoEncontradaException("Montadora não encontrada");
        return getMontadora(resultSet);
    }

    private Montadora getMontadora(ResultSet resultSet) throws SQLException {
        int codigo = resultSet.getInt("id");
        String nome = resultSet.getString("nome");
        String cnpj = resultSet.getString("cnpj");
        return new Montadora(codigo, cnpj, nome);
    }

}
