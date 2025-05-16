package br.com.fiap.esporte.model;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private boolean aposentado;

    public PessoaFisica(String nome){
        super(nome);
    }

    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }
}
