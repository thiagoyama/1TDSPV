package br.com.fiap.exercicio.model;

public class Cor {

    //Atributos
    private String nome;
    private int r, g, b;

    //Método
    public void alterarCor(int r, int g, int b, String nome){
        this.r = r;
        this.g = g;
        this.b = b;
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG(){
        return g;
    }

    public int getB(){
        return b;
    }

    public void setG(int g){
        this.g = g;
    }

    public void setB(int b){
        this.b = b;
    }
}
