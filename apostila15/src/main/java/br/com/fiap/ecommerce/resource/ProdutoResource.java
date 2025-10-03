package br.com.fiap.ecommerce.resource;

import br.com.fiap.ecommerce.dao.ProdutoDao;
import br.com.fiap.ecommerce.model.Produto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.SQLException;

@Path("/produtos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoResource {

    @Inject
    private ProdutoDao produtoDao;

    @POST
    public Response create(Produto produto) throws SQLException {
        produtoDao.cadastrar(produto);
        return Response.ok().build(); //HTTP STATUS CODE 201 (Created)
    }

}
