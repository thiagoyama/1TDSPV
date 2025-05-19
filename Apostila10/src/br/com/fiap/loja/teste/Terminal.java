package br.com.fiap.loja.teste;

import br.com.fiap.loja.model.Alimento;
import br.com.fiap.loja.model.Produto;

public class Terminal {

    public static void main(String[] args) {
        //Instanciar um produto
        Produto produto = new Produto();

        //Setar o preço
        produto.setPreco(100);

        //Calcular 10% de desconto e exibir
        System.out.println(produto.calcularDesconto(10));
        //Cacular o desconto padrão
        System.out.println(produto.calcularDesconto());

        //Instanciar o alimento
        Alimento alimento = new Alimento();
        //Setar o preço do alimento
        alimento.setPreco(100);
        //Calcular e exibir o valor com desconto padrão
        System.out.println(alimento.calcularDesconto());

    }
}
