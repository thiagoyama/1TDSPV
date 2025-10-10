package br.com.fiap.ecommerce.dao;

import br.com.fiap.ecommerce.exception.EntidadeNaoEncontradaException;
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

    public void atualizar(Produto produto) throws SQLException, EntidadeNaoEncontradaException {
        try (Connection conexao = dataSource.getConnection()){
            PreparedStatement stmt = conexao.prepareStatement("update t_tdspv_produto set nm_produto = ?, " +
                    "qt_produto = ?, vl_produto = ?, dt_validade =? where cd_produto = ?");
            //Seta os parametros
            setarParametros(produto, stmt);
            stmt.setInt(5 , produto.getCodigo());
            //Executa a query e valida se deu bom
            if (stmt.executeUpdate() == 0)
                throw new EntidadeNaoEncontradaException("Produto não existe para ser atualizado");
        }
    }

    private static void setarParametros(Produto produto, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, produto.getNome());
        stmt.setInt(2, produto.getQuantidade());
        stmt.setDouble(3, produto.getValor());
        stmt.setObject(4, produto.getDataValidade());
    }

    public Produto buscar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
        try (Connection conexao = dataSource.getConnection()){
            PreparedStatement stmt = conexao.prepareStatement("select * from t_tdspv_produto where cd_produto = ?");
            //Seta o id na query
            stmt.setInt(1, codigo);
            //Executa a query
            ResultSet rs = stmt.executeQuery();
            //Validar se encontrou o produto
            //se não encontrou lança exception
            if (!rs.next())
                throw new EntidadeNaoEncontradaException("Produto não encontrado");
            //se encontrou recupera os valores e retorna
            return parseProduto(rs);
        }
    }

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

            setarParametros(produto, stmt);

            stmt.executeUpdate();

            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next()){
                produto.setCodigo(resultSet.getInt(1));
            }

        }
    }

}
