package br.com.fiap.api.model;

public class Condominio {

    private int id;
    private String nome;
    private String bloco;

    public Condominio() {}

    public Condominio(String nome, String bloco) {
        this.nome = nome;
        this.bloco = bloco;
    }

    public Condominio(int id, String nome, String bloco) {
        this.id = id;
        this.nome = nome;
        this.bloco = bloco;
    }

    public Condominio(int idCondominio) {
        this.id = idCondominio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}
