package br.com.fiap.apostila13.model;

public class Montadora {

    private int id;
    private String cnpj;
    private String nome;

    public Montadora() {}

    public Montadora(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public Montadora(int id, String cnpj, String nome) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", nome: " + nome + ", cnpj: " + cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
