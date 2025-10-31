package br.com.fiap.ecommerce.dto.produto;

import br.com.fiap.ecommerce.dto.categoria.DetalhesCategoriaDto;

public class DetalhesProdutoDto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double valor;

    private DetalhesCategoriaDto categoria;

    public DetalhesCategoriaDto getCategoria() {
        return categoria;
    }

    public void setCategoria(DetalhesCategoriaDto categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
}
