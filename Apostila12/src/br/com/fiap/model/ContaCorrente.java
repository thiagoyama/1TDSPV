package br.com.fiap.model;

import br.com.fiap.util.ValidacaoNumero;

public class ContaCorrente {

    private double saldo;

    //Criar o método depositar
    public void depositar(double valor) throws Exception {
        ValidacaoNumero.validarMaiorQueZero(valor);
        saldo += valor;
    }

    //Criar o método retirar
    public void retirar(double valor) throws Exception {
        ValidacaoNumero.validarMaiorQueZero(valor);
        ValidacaoNumero.validarMaiorOuIgualAZero(saldo - valor);
        saldo -= valor;
    }

    //Criar o método retornar saldo
    public double getSaldo(){
        return saldo;
    }

}
