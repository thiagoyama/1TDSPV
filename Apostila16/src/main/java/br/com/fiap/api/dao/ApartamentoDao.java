package br.com.fiap.api.dao;

import br.com.fiap.api.model.Apartamento;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ApartamentoDao {

    private DataSource dataSource;

    private static final String INSERT_SQL = "insert into tb_apartamento (cd_apartamento, nr_area, " +
            "nr_apartamento, dt_ocupacao, st_ocupado, cd_condominio) values (sq_tb_apartamento.nextval, ?, ?, ?, ?, ?)";

    public ApartamentoDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // resultSet.getObject("dt_ocupacao", LocalDate.class); -- recuperar a data

    public void cadastrar(Apartamento ap) throws SQLException {
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(INSERT_SQL, new String[] {"cd_condominio"})){
            stmt.setDouble(1, ap.getArea());
            stmt.setInt(2, ap.getNumero());
            stmt.setObject(3, ap.getDataOcupacao());
            stmt.setBoolean(4, ap.isOcupado());
            stmt.setInt(5, ap.getCondominio().getId());
            stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next())
                ap.setId(resultSet.getInt(1));
        }
    }

}
