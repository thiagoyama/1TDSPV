package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ApartamentoDao;
import br.com.fiap.api.dao.CondominioDao;
import br.com.fiap.api.dto.CondominioRequestDto;
import br.com.fiap.api.dto.CondominioResponseDto;
import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Apartamento;
import br.com.fiap.api.model.Condominio;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/condominios")
public class CondominioController {

    private CondominioDao dao;
    private ApartamentoDao apDao;
    private ModelMapper mapper;

    public CondominioController(CondominioDao dao, ApartamentoDao apDao, ModelMapper mapper){
        this.apDao = apDao;
        this.dao = dao;
        this.mapper = mapper;
    }

    @GetMapping("/{id}/apartamentos")
    public List<Apartamento> listarApartamentos(@PathVariable int id) throws SQLException {
        return apDao.buscarPorCondominio(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable int id, @RequestBody CondominioRequestDto dto) throws EntidadeNaoEncontradaException, SQLException {
        Condominio condominio = mapper.map(dto, Condominio.class);
        condominio.setId(id);
        dao.atualizar(condominio);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) throws EntidadeNaoEncontradaException, SQLException {
        dao.remover(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CondominioResponseDto> buscar(@PathVariable int id) throws EntidadeNaoEncontradaException, SQLException {
        Condominio condominio = dao.buscar(id);
        return ResponseEntity.ok(mapper.map(condominio, CondominioResponseDto.class));
    }

    @GetMapping
    public List<CondominioResponseDto> listar() throws SQLException {
        return dao.listar().stream()
                .map(churros -> mapper.map(churros, CondominioResponseDto.class)).toList();
    }

    @PostMapping
    public ResponseEntity<CondominioResponseDto> inserir(@RequestBody CondominioRequestDto dto,
                                              UriComponentsBuilder builder) throws SQLException {

        Condominio condominio = mapper.map(dto, Condominio.class);

        //Cadastra no banco de dados
        dao.cadastrar(condominio);

        //Cria a URL para acessar o condominio criado (vai na resposta)
        URI uri = builder.path("/condominios/{id}")
                .buildAndExpand(condominio.getId()).toUri();

        //Retorna o Status HTTP 201, a URI e o Condominio
        return ResponseEntity.created(uri).body(mapper.map(condominio, CondominioResponseDto.class));
    }

    @GetMapping("churros")
    public String dizerOla(){
        return "Ola Mundo!";
    }

}
