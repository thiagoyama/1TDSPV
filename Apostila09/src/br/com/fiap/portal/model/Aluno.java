package br.com.fiap.portal.model;

public class Aluno extends Pessoa {

    private int rm;
    private String curso;

    public Aluno(String nome, String cpf){
        super(nome, cpf); //Chama o construtor da classe pai
    }

    //Criar um construtor com o nome, cpf, rm e curso
    public Aluno(String nome, String cpf, int rm, String curso){
        super(nome, cpf);
        this.rm = rm;
        this.curso = curso;
    }

    //Criar um construtor com o nome, cpf, idade, endereco, rm e curso
    public Aluno(String nome, String cpf, int idade, Endereco endereco, int rm, String curso){
        super(nome, cpf, idade, endereco);
        this.rm = rm;
        this.curso = curso;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
