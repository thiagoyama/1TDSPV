package br.com.fiap.empresa.model;

public class Funcionario {

    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;

    //Construtor vazio
    public Funcionario(){}

    //Construtor com matricula
    public Funcionario(long matricula){
        this.matricula = matricula;
    }

    //Construtor com matricula e nome
    public Funcionario(long matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    //Construtor com matricula, nome e profissão
    public Funcionario(long matricula, String nome, Profissao profissao){
        this.matricula = matricula;
        this.nome = nome;
        this.profissao = profissao;
    }

    public String exibirDados(){
        return "Nome: " + nome + ", matricula: " + matricula + ", salario: " + salario + ", profissao: " + profissao.getNome();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
