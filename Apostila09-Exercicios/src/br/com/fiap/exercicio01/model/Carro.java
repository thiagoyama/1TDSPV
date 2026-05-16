package br.com.fiap.exercicio01.model;

public class Carro extends Veiculo {

    private int quantidadePorta;
    private String placa;
    private float motor = 1;

    public Carro(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor, int quantidadePorta, String placa, float motor) {
        super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
        this.quantidadePorta = quantidadePorta;
        this.placa = placa;
        this.motor = motor;
    }

    public int getQuantidadePorta() {
        return quantidadePorta;
    }

    public void setQuantidadePorta(int quantidadePorta) {
        this.quantidadePorta = quantidadePorta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
