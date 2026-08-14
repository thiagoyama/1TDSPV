package br.com.fiap.apostila12.model;

import java.util.InputMismatchException;

public class Turma {

    private int sala;
    private int quantidadeAlunos;
    private String materia;

    public void alterarSala(int sala) {
        //validar se a sala existe (se está entre 100 e 1010)
        if (sala >= 100 && sala <=1010){
            this.sala = sala;
        } else {
            //lançar uma exception
            throw new RuntimeException("Sala inválida");
        }
    }

    public int getSala() {
        return sala;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
