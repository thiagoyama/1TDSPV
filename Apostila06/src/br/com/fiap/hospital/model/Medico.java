package br.com.fiap.hospital.model;

public class Medico {

    private String nome;
    private int crm;
    private String especialidade;
    private boolean ativo;

    //Construtor
    public Medico(String nome, int crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public Medico(String nome, int crm, boolean ativo){
        this.nome = nome;
        this.crm = crm;
        this.ativo = ativo;
    }

    public Medico( String nome, int crm, String especialidade, boolean ativo){
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
