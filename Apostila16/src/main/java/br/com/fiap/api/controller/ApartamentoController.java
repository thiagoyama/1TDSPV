package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ApartamentoDao;
import br.com.fiap.api.model.Apartamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;

@RestController
@RequestMapping("apartamentos")
public class ApartamentoController {

    private ApartamentoDao dao;

    public ApartamentoController(ApartamentoDao dao) {
        this.dao = dao;
    }

    @PostMapping
    public ResponseEntity<Apartamento> cadastrar(@RequestBody Apartamento ap,
                                          UriComponentsBuilder builder) throws SQLException {
        dao.cadastrar(ap);
        URI uri = builder.path("/apartamentos/{id}").buildAndExpand(ap.getId()).toUri();
        return ResponseEntity.created(uri).body(ap);
    }



}
