package br.com.fiap.api.dao;

import br.com.fiap.api.model.Apartamento;
import br.com.fiap.api.model.Condominio;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ApartamentoDao {

    private DataSource dataSource;

    private static final String INSERT_SQL = "insert into tb_apartamento (cd_apartamento, nr_area, " +
            "nr_apartamento, dt_ocupacao, st_ocupado, cd_condominio) values (sq_tb_apartamento.nextval, ?, ?, ?, ?, ?)";

    private static final String SELECT_SQL = "select * from tb_apartamento";

    public ApartamentoDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Apartamento> listar() throws SQLException {
        try (Connection conexao = dataSource.getConnection();
        PreparedStatement stmt = conexao.prepareStatement(SELECT_SQL)){
            ResultSet resultSet = stmt.executeQuery();
            List<Apartamento> lista = new ArrayList<>();
            while (resultSet.next())
                lista.add(getApartamento(resultSet));
            return lista;
        }
    }

    private Apartamento getApartamento(ResultSet resultSet) throws SQLException {
        int codigo = resultSet.getInt("cd_apartamento");
        int numero = resultSet.getInt("nr_apartamento");
        double area = resultSet.getDouble("nr_area");
        LocalDate dataOcupacao = resultSet.getObject("dt_ocupacao", LocalDate.class);
        boolean ocupado = resultSet.getBoolean("st_ocupado");
        int idCondominio = resultSet.getInt("cd_condominio");
        return new Apartamento(codigo, numero, area, dataOcupacao, ocupado, new Condominio(idCondominio));
    }

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
