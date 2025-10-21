package br.com.fiap.ecommerce.resource;

import br.com.fiap.ecommerce.dao.ProdutoDao;
import br.com.fiap.ecommerce.dto.produto.AtualizarProdutoDto;
import br.com.fiap.ecommerce.dto.produto.CadastroProdutoDto;
import br.com.fiap.ecommerce.dto.produto.DetalhesProdutoDto;
import br.com.fiap.ecommerce.exception.EntidadeNaoEncontradaException;
import br.com.fiap.ecommerce.model.Produto;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.modelmapper.ModelMapper;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@Path("/produtos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoResource {

    @Inject
    private ProdutoDao produtoDao;

    @Inject
    private ModelMapper modelMapper;

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") int codigo) throws EntidadeNaoEncontradaException, SQLException {
        produtoDao.deletar(codigo);
        return Response.noContent().build(); // 204 No content
    }

    @PUT
    @Path("/{id}")
    public Response atualizar(@PathParam("id") int codigo, @Valid AtualizarProdutoDto dto) throws EntidadeNaoEncontradaException, SQLException {
        Produto produto = modelMapper.map(dto, Produto.class);
        produto.setCodigo(codigo);
        produtoDao.atualizar(produto);
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response buscar(@PathParam("id") int codigo) throws SQLException, EntidadeNaoEncontradaException {
        DetalhesProdutoDto dto = modelMapper
                .map(produtoDao.buscar(codigo), DetalhesProdutoDto.class);
        return Response.ok(dto).build();
    }

    @GET
    public List<DetalhesProdutoDto> listar() throws SQLException {
        return produtoDao.listar().stream().map(
                p -> modelMapper.map(p, DetalhesProdutoDto.class)
        ).toList();
    }

    @POST
    public Response create(@Valid CadastroProdutoDto dto, @Context UriInfo uriInfo) throws SQLException {
        Produto produto = modelMapper.map(dto, Produto.class);

        produtoDao.cadastrar(produto);

        //Constroi uma URL de retorno, para acessar o recurso criado
        URI uri = uriInfo.getAbsolutePathBuilder()
                .path(String.valueOf(produto.getCodigo())).build();

        return Response.created(uri)
                .entity(modelMapper.map(produto, DetalhesProdutoDto.class))
                .build(); //HTTP STATUS CODE 201 (Created)
    }

}
