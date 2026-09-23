package br.com.fiap.api.controller;

import br.com.fiap.api.dao.CondominioDao;
import br.com.fiap.api.model.Condominio;
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

    public CondominioController(CondominioDao dao){
        this.dao = dao;
    }

    @GetMapping
    public List<Condominio> listar() throws SQLException {
        return dao.listar();
    }

    @PostMapping
    public ResponseEntity<Condominio> inserir(@RequestBody Condominio condominio,
                                              UriComponentsBuilder builder) throws SQLException {
        //Cadastra no banco de dados
        dao.cadastrar(condominio);

        //Cria a URL para acessar o condominio criado (vai na resposta)
        URI uri = builder.path("/condominios/{id}")
                .buildAndExpand(condominio.getId()).toUri();

        //Retorna o Status HTTP 201, a URI e o Condominio
        return ResponseEntity.created(uri).body(condominio);
    }

    @GetMapping("churros")
    public String dizerOla(){
        return "Ola Mundo!";
    }

}
