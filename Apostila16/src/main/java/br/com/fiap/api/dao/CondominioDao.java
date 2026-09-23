package br.com.fiap.api.dao;

import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Condominio;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CondominioDao {

    private final DataSource dataSource;
    private final String INSERT_SQL = "insert into tb_condominio (cd_condominio, nm_condominio, ds_bloco) values (sq_tb_condominio.nextval, ?, ?)";
    private final String SELECT_SQL = "select * from tb_condominio";
    private final String SELECT_BY_ID_SQL = "select * from tb_condominio where cd_condominio = ?";

    public CondominioDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public Condominio buscar(int id) throws SQLException, EntidadeNaoEncontradaException {
        try (Connection conexao = dataSource.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(SELECT_BY_ID_SQL)){
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (!resultSet.next())
                throw new EntidadeNaoEncontradaException("Condominio não encontrado");
            return getCondominio(resultSet);
        }
    }

    public List<Condominio> listar() throws SQLException{
        try (Connection conexao = dataSource.getConnection();
        PreparedStatement stmt = conexao.prepareStatement(SELECT_SQL)){
            ResultSet resultSet = stmt.executeQuery();
            List<Condominio> lista = new ArrayList<>();
            while (resultSet.next())
                lista.add(getCondominio(resultSet));
            return lista;
        }
    }

    private Condominio getCondominio(ResultSet resultSet) throws SQLException{
        int id = resultSet.getInt("cd_condominio");
        String nome = resultSet.getString("nm_condominio");
        String bloco = resultSet.getString("ds_bloco");
        return new Condominio(id, nome, bloco);
    }

    public void cadastrar(Condominio condominio) throws SQLException {
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(INSERT_SQL, new String[] {"cd_condominio"})){
            stmt.setString(1, condominio.getNome());
            stmt.setString(2, condominio.getBloco());
            stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next())
                condominio.setId(resultSet.getInt(1));
        }//try
    }//cadastrar

}//class
