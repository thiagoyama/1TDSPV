package br.com.fiap.model;

public class ContaCorrente {

    private double saldo;

    //Criar o método depositar
    public void depositar(double valor){
        saldo += valor;
    }

    //Criar o método retirar
    public void retirar(double valor){
        saldo -= valor;
    }

    //Criar o método retornar saldo
    public double getSaldo(){
        return saldo;
    }

}
