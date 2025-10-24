package br.com.fiap.ecommerce.dto.categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CadastroCategoriaDto {

    @NotBlank
    @Size(max = 20)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
