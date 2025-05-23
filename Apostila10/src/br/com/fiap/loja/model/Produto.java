package br.com.fiap.loja.model;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;

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
            calcularDesconto(10);
        else if (cupom.equals("FIAP20"))
            calcularDesconto(20);
        return preco;
    }

    //Sobrescrita do método na classe Alimento
    //Recebe uma String (cupom) FIAP10 -> 10%, FIAP20 -> 20%, FIAP 40%

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
