package br.com.fiap.ecommerce.dao;

import br.com.fiap.ecommerce.model.Produto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ProdutoDao {

    @Inject
    private DataSource dataSource;

    public List<Produto> listar() throws SQLException {
        try (Connection conexao = dataSource.getConnection()){
            PreparedStatement stmt = conexao.prepareStatement("select * from t_tdspv_produto");
            ResultSet rs = stmt.executeQuery();
            List<Produto> lista = new ArrayList<>();
            while (rs.next()){
                Produto produto = parseProduto(rs);
                lista.add(produto);
            }
            return lista;
        }
    }

    private Produto parseProduto(ResultSet rs) throws SQLException {
        int codigo = rs.getInt("cd_produto");
        String nome = rs.getString("nm_produto");
        int quantidade = rs.getInt("qt_produto");
        double valor = rs.getDouble("vl_produto");
        LocalDate dataValidade = rs.getObject("dt_validade", LocalDate.class);
        return new Produto(codigo, nome, quantidade, valor, dataValidade);
    }

    public void cadastrar(Produto produto) throws SQLException {
        try (Connection conexao = dataSource.getConnection()) {

            PreparedStatement stmt = conexao.prepareStatement("insert into t_tdspv_produto (cd_produto, nm_produto, " +
                    "qt_produto, vl_produto, dt_validade) values (sq_tdspv_produto.nextval, ?, ?, ?, ? )", new String[] {"cd_produto"});

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getValor());
            stmt.setObject(4, produto.getDataValidade());

            stmt.executeUpdate();

            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next()){
                produto.setCodigo(resultSet.getInt(1));
            }

        }
    }

}
