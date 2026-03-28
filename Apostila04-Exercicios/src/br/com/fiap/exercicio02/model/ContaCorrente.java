package br.com.fiap.exercicio02.model;

public class ContaCorrente {

    public double saldo;
    public Cliente titular;

    public void depositar(double valor){
        saldo += valor; //saldo = saldo + valor;
    }

    public void retirar(double valor){
        saldo -= valor; //saldo = saldo - valor;
    }

    public double retonarSaldo(){
        return saldo;
    }

}
