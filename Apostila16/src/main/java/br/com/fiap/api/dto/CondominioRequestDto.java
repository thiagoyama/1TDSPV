package br.com.fiap.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CondominioRequestDto {

    private int id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 20, message = "Máximo de 20 caracteres")
    private String nome;

    @NotBlank
    @Size(max = 5, min = 2)
    private String bloco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
