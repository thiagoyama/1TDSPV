package br.com.fiap.ecommerce.dao;

import br.com.fiap.ecommerce.model.Produto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@ApplicationScoped
public class ProdutoDao {

    @Inject
    private DataSource dataSource;

    public void cadastrar(Produto produto) throws SQLException {
        try (Connection conexao = dataSource.getConnection()) {

            PreparedStatement stmt = conexao.prepareStatement("insert into t_tdspv_produto (cd_produto, nm_produto, " +
                    "qt_produto, vl_produto, dt_validade) values (sq_tdspv_produto.nextval, ?, ?, ?, ? )");

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getValor());
            stmt.setObject(4, produto.getDataValidade());

            stmt.executeUpdate();

        }
    }

}
