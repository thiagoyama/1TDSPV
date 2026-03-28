package br.com.fiap.exercicio02.model;

public class Cliente {

    public String nome;
    public String cpf;
    public Endereco endereco;

    public String retornarDados(){
        return nome + " " + cpf;
    }

}
