package br.com.fiap.model;

public class Veiculo {

    //placa, ano, modelo
    private String placa;
    private int ano;
    private String modelo;

    //Construtores
    public Veiculo(String placa, int ano, String modelo) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + ", ano: " + ano + ", placa: " + placa;
    }

    //Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
