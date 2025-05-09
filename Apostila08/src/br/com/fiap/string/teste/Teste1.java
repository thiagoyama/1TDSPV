package br.com.fiap.string.teste;

public class Teste1 {

    public static void main(String[] args) {
        //Declarar uma String
        String nome = "Churros\nClassico";
        double preco = 15;
        //Concatenação de Strings ou outro tipo numérico
        String produto = nome + "\nR$" + preco;
        produto = produto + " reais";
        System.out.println(produto);
    }
}
