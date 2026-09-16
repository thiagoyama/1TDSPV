package br.com.fiap.api.dao;

import br.com.fiap.api.model.Condominio;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CondominioDao {

    private final DataSource dataSource;
    private final String INSERT_SQL = "insert into tb_condominio (cd_condominio, nm_condominio, ds_bloco) values (sq_tb_condominio.nextval, ?, ?)";

    public CondominioDao(DataSource dataSource){
        this.dataSource = dataSource;
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
