package br.com.fiap.util;

public class ValidacaoNumero {

    public static void validarMaiorQueZero(double valor) throws Exception {
        if (valor <= 0)
            throw new Exception("O valor deve ser maior do que zero");
    }

    public static void validarMaiorOuIgualAZero(double valor) throws Exception {
        if (valor < 0)
            throw new Exception("O valor deve ser maior do que zero");
    }

}
