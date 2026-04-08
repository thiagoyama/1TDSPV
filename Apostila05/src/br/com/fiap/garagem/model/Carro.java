package br.com.fiap.garagem.model;

public class Carro {

    private String placa;
    private int numeroVaga;
    private boolean preferencial;
    private char setor;
    private String horaEntrada;
    private String horaSaida;
    private double valor;

    public double calcularValorPagar(){
        int tempo = calcularTempoEstadia();
        return tempo * 15;
    }

    private int calcularTempoEstadia(){
        return 5;
    }

    //Métodos Getters e Setters
    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public char getSetor() {
        return setor;
    }

    public void setSetor(char setor) {
        this.setor = setor;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
}
