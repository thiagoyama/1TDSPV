public class Produto {

    //Atributos
    String nome;
    int codigo;
    float preco;
    boolean disponivel;
    Fornecedor fornecedor;

    //Métodos
    //Criar uma função que aumenta o preço do produto em porcentagem
    void aumentarPreco(float porcentagem){
        preco += preco * porcentagem/100; //preco = preco * porcentagem/100 + preco;
    }

    //Criar um método que calcula o valor do produto com um desconto específico
    float calcularDesconto(float porcentagem){
        float desconto;
        desconto = preco - preco * porcentagem / 100;
        return desconto;
    }

}
