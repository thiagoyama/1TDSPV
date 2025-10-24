package br.com.fiap.ecommerce.dao;

import br.com.fiap.ecommerce.model.Categoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import oracle.jdbc.proxy.annotation.Pre;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CategoriaDao {

    @Inject
    private DataSource dataSource;

    public void cadastrar(Categoria categoria) throws SQLException {
        try (Connection conexao = dataSource.getConnection()){
            PreparedStatement stmt = conexao.prepareStatement(
                    "insert into t_tdspv_categoria (cd_categoria, nm_categoria) values " +
                            "(sq_tdspv_categoria.nextval, ?)", new String[] {"cd_categoria"});
            stmt.setString(1, categoria.getNome());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next())
                categoria.setCodigo(rs.getInt(1));
        }
    }

    public List<Categoria> listar() throws SQLException {
        try (Connection conexao = dataSource.getConnection()){
            PreparedStatement stmt = conexao.prepareStatement("select * from t_tdspv_categoria");
            ResultSet rs = stmt.executeQuery();
            List<Categoria> lista = new ArrayList<>();
            while (rs.next()){
                Categoria categoria = parseCategoria(rs);
                lista.add(categoria);
            }
            return lista;
        }
    }

    private static Categoria parseCategoria(ResultSet rs) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setCodigo(rs.getInt("cd_categoria"));
        categoria.setNome(rs.getString("nm_categoria"));
        return categoria;
    }


}
