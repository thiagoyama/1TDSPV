package br.com.fiap.portal.model;

public class Aluno extends Pessoa {

    private int rm;
    private String curso;

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
