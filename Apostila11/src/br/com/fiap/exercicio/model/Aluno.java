package br.com.fiap.exercicio.model;

public class Aluno {

    private int rm;
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(){}

    public Aluno(int rm, String nome, int idade, double nota1, double nota2) {
        this.rm = rm;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return rm + " " + nome + ", idade: " + idade + ", nota 1: " + nota1 + ", nota 2: " + nota2;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
