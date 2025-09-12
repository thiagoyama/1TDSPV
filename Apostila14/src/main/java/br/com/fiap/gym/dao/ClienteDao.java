package br.com.fiap.gym.dao;

import br.com.fiap.gym.factory.ConnectionFactory;
import br.com.fiap.gym.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public void atualizar(Cliente cliente){}

    public void remover(int codigo){}

    public Cliente buscar(int codigo){ return null;}

    public List<Cliente> listar(){ return null; }

}
