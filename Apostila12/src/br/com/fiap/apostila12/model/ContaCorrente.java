package br.com.fiap.apostila12.model;

public class ContaCorrente {

    private double saldo;

    public void depositar(double valor) throws Exception {
        if (valor <= 0)
            throw new Exception("Valor inválido para depósito");
        saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }

}
