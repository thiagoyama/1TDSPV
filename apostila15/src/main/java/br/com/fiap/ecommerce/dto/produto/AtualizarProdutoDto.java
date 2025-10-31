package br.com.fiap.ecommerce.dto.produto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class AtualizarProdutoDto {

    @Size(max = 80)
    @NotBlank
    private String nome;

    @PositiveOrZero
    private int quantidade;

    @Positive
    private double valor;

    @Future
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
