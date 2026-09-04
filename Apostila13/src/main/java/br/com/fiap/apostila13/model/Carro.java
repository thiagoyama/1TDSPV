package br.com.fiap.apostila13.model;

public class Carro {

    private int id;
    private int ano;
    private String cor;
    private String modelo;
    private double valor;
    private boolean automatico;

    @Override
    public String toString() {
        return id + " Modelo: " + modelo + " Ano: "
                + ano + " Cor: " + cor + " Valor: " + valor + " Automático: " + automatico;
    }

    //Construtores
    public Carro() {
    }

    public Carro(int id, int ano, String cor, String modelo, double valor, boolean automatico) {
        this.id = id;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.valor = valor;
        this.automatico = automatico;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}
