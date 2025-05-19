package br.com.fiap.loja.model;

import java.time.LocalDate;

public class Alimento extends Produto{

    private LocalDate dataVencimento;

    @Override //Sobrescrita do método do pai
    public double calcularDesconto(){
        //Calcular um desconto de 15%
        return calcularDesconto(15);
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
