package br.com.fiap.ecommerce.resource;

import br.com.fiap.ecommerce.dao.CategoriaDao;
import br.com.fiap.ecommerce.dto.categoria.CadastroCategoriaDto;
import br.com.fiap.ecommerce.dto.categoria.DetalhesCategoriaDto;
import br.com.fiap.ecommerce.model.Categoria;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.modelmapper.ModelMapper;

import java.sql.SQLException;
import java.util.List;

@Path("/categorias")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaResource {

    @Inject
    private CategoriaDao categoriaDao;

    @Inject
    private ModelMapper mapper;

    @GET
    public List<DetalhesCategoriaDto> get() throws SQLException {
        return categoriaDao.listar().stream()
                .map( c -> mapper.map(c, DetalhesCategoriaDto.class)).toList();
    }

    @POST
    public Response create(@Valid CadastroCategoriaDto dto, @Context UriInfo uriInfo) throws SQLException {
        Categoria categoria = mapper.map(dto, Categoria.class);
        categoriaDao.cadastrar(categoria);
        UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder()
                .path(String.valueOf(categoria.getCodigo()));
        return Response.created(uriBuilder.build()).entity(mapper.map(categoria, DetalhesCategoriaDto.class)).build();
    }

}
