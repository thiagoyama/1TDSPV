package br.com.fiap.gym.dao;

import br.com.fiap.gym.exception.EntidadeNaoEncontradaException;
import br.com.fiap.gym.factory.ConnectionFactory;
import br.com.fiap.gym.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClienteDao {

    private Connection conexao;

    public ClienteDao() throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar(Cliente cliente) throws SQLException {
        //Criar o comando SQL
        PreparedStatement stmt = conexao.prepareStatement("insert into t_tdspv_cliente (cd_cliente, nm_cliente," +
                "nr_telefone, nr_cpf, st_ativo, vl_peso) values (?,?,?,?,?,?)");
        //Setar os valores dos parametros no comando SQL
        stmt.setInt(1, cliente.getCodigo());
        stmt.setString(2, cliente.getNome());
        stmt.setString(3, cliente.getTelefone());
        stmt.setString(4, cliente.getCpf());
        stmt.setBoolean(5, cliente.isAtivo());
        stmt.setDouble(6, cliente.getPeso());
        //Executa o comando SQL
        stmt.executeUpdate();
    }

    public void atualizar(Cliente cliente) throws SQLException {
        //Criar o PreparedStatement com o comando de Update
        PreparedStatement stmt = conexao.prepareStatement("update t_tdspv_cliente set nm_cliente = ? ," +
                "nr_telefone = ?, nr_cpf = ?, st_ativo = ?, vl_peso = ? where cd_cliente = ?");
        //Setar os valores para o comando SQL
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getTelefone());
        stmt.setString(3, cliente.getCpf());
        stmt.setBoolean(4, cliente.isAtivo());
        stmt.setDouble(5, cliente.getPeso());
        stmt.setInt(6, cliente.getCodigo());
        //Executar o comando SQL
        stmt.executeUpdate();
    }

    public void remover(int codigo){}

    public Cliente buscar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o PreparedStament com o o select
        PreparedStatement stmt = conexao.prepareStatement("select * from t_tdspv_cliente where cd_cliente = ?");
        //Setar o código do cliente no comando SQL
        stmt.setInt(1, codigo);
        //Executar o comando
        ResultSet rs = stmt.executeQuery();
        //Recuperar os dados do banco
        if (!rs.next()) {
            throw new EntidadeNaoEncontradaException("Cliente não encontrado");
        }
        //Criar o cliente e retornar
        int codigoCliente = rs.getInt("cd_cliente");
        String nome = rs.getString("nm_cliente");
        String telefone = rs.getString("nr_telefone");
        String cpf = rs.getString("nr_cpf");
        boolean ativo = rs.getBoolean("st_ativo");
        double peso = rs.getDouble("vl_peso");
        Cliente cliente =  new Cliente(codigoCliente, nome, telefone, cpf, ativo, peso);
        return cliente;
    }

    public List<Cliente> listar(){ return null; }

}
