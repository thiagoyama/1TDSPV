package br.com.fiap.gym.model;

public class Cliente {

    private int codigo;
    private String nome;
    private String telefone;
    private String cpf;
    private boolean ativo;
    private double peso;

    public Cliente() {}

    public Cliente(int codigo, String nome, String telefone, String cpf, boolean ativo, double peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.ativo = ativo;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nome: " + nome + ", Telefone: " +
                telefone + " CPF: " + cpf + ", Ativo: " + ativo + ", Peso: " + peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
