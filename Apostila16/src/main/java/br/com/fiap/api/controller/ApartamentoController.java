package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ApartamentoDao;
import br.com.fiap.api.dto.ApartamentoRequestDto;
import br.com.fiap.api.dto.ApartamentoResponseDto;
import br.com.fiap.api.model.Apartamento;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("apartamentos")
public class ApartamentoController {

    private ApartamentoDao dao;
    private ModelMapper mapper;

    public ApartamentoController(ApartamentoDao dao, ModelMapper mapper) {
        this.mapper = mapper;
        this.dao = dao;
    }

    @GetMapping
    public List<ApartamentoResponseDto> listar() throws SQLException {
        return dao.listar().stream()
                .map(a -> mapper.map(a, ApartamentoResponseDto.class)).toList();
    }

    @PostMapping
    public ResponseEntity<ApartamentoResponseDto> cadastrar(
            @Valid @RequestBody ApartamentoRequestDto dto,
            UriComponentsBuilder builder) throws SQLException {
        Apartamento ap = mapper.map(dto, Apartamento.class);
        dao.cadastrar(ap);
        URI uri = builder.path("/apartamentos/{id}").buildAndExpand(ap.getId()).toUri();
        return ResponseEntity.created(uri).body(mapper.map(ap, ApartamentoResponseDto.class));
    }



}
