package br.com.fiap.loja.model;

import java.time.LocalDate;

public class Alimento extends Produto{

    private LocalDate dataVencimento;

    public Alimento(int codigo, String descricao, double preco, LocalDate dataVencimento) {
        super(codigo, descricao, preco);
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data Vencimento: " + dataVencimento;
    }

    @Override //Sobrescrita do método do pai
    public double calcularDesconto(){
        //Calcular um desconto de 15%
        return calcularDesconto(15);
    }

    @Override
    public double calcularDesconto(String cupom){
        //validar o cupom de 40%
        if (cupom.equals("FIAP40"))
            return calcularDesconto(40);
        return super.calcularDesconto(cupom);
    }


    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
