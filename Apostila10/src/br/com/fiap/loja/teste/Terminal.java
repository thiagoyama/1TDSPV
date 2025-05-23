package br.com.fiap.loja.teste;

import br.com.fiap.loja.model.Alimento;
import br.com.fiap.loja.model.Produto;

import java.time.LocalDate;

public class Terminal {

    public static void main(String[] args) {
        //Instanciar um produto
        Produto produto = new Produto(1, "Prato", 100);

        //Calcular 10% de desconto e exibir
        System.out.println(produto.calcularDesconto(10));
        //Cacular o desconto padrão
        System.out.println(produto.calcularDesconto());

        //Instanciar o alimento
        Alimento alimento = new Alimento(2, "Churros", 15, LocalDate.now());

        //Calcular e exibir o valor com desconto padrão
        System.out.println(alimento.calcularDesconto());

        //Alimento é um produto?
        Produto churros = new Alimento(3, "Pão", 10, LocalDate.of(2025, 1, 20));

        System.out.println(churros.calcularDesconto()); //Valor impresso?

        //Testar o método de calculo do desconto com cupom
        System.out.println("CUPOM " + produto.calcularDesconto("FIAP10"));

        //Testar o cupom de 40% de desconto
        System.out.println("CUPOM 40 " + alimento.calcularDesconto("FIAP40"));

        System.out.println(produto);
        System.out.println(alimento);
        System.out.println(churros);
        //br.com.fiap.loja.model.Produto@5sadf6as4d
        //Código: xxx, Descrição: xxxxxx, Preço: XXXXX
    }
}
