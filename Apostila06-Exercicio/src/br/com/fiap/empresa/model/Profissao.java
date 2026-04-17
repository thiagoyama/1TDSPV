package br.com.fiap.empresa.model;

public class Profissao {

    private String nome;

    //Construtor com o nome e o construtor padrão (vazio)
    public Profissao(){}

    public Profissao(String nome){
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
