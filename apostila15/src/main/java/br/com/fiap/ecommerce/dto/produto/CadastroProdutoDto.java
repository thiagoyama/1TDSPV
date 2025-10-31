package br.com.fiap.ecommerce.dto.produto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class CadastroProdutoDto {

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 80, min = 2)
    private String nome;

    @Positive
    private int quantidade;

    @Positive
    private double valor;

    @Future(message = "A data deve estar no futuro")
    private LocalDate dataValidade;

    @Positive
    private int categoria;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
