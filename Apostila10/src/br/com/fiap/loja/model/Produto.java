package br.com.fiap.loja.model;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descrição: " + descricao + ", Preço: " + preco;
    }

    //Métodos
    //Calcula e retorna o valor com desconto
    public double calcularDesconto(int porcentagem){
        return preco - (preco * porcentagem)/100;
    }

    //Calcula o desconto padrão de 5%
    public double calcularDesconto(){
        return calcularDesconto(5);
    }

    //Sobrecarga do método de calcular desconto
    //Recebe uma String (cupom) FIAP10 -> 10%, FIAP20 -> 20%
    public double calcularDesconto(String cupom){
        if (cupom.equals("FIAP10"))
            return calcularDesconto(10);
        else if (cupom.equals("FIAP20"))
            return calcularDesconto(20);
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
