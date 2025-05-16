package br.com.fiap.esporte.model;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;
    private double faturamento;

    //Criar um construtor para chamar o construtor do pai
    public PessoaJuridica(String nome){
        super(nome);
    }

    public PessoaJuridica(String nome, String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
}
