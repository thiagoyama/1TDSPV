package br.com.fiap.loja.model;

public class Eletronico extends Produto {

    public Eletronico(int codigo, String descricao, double preco, int voltagem) {
        super(codigo, descricao, preco);
        this.voltagem = voltagem;
    }

    private int voltagem;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}
