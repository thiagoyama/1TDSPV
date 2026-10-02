package br.com.fiap.api.model;

import java.time.LocalDate;

public class Apartamento {

    private int id;
    private int numero;
    private double area;
    private LocalDate dataOcupacao;
    private boolean ocupado;
    private Condominio condominio;

    public Apartamento(){}

    public Apartamento(int numero, double area, LocalDate dataOcupacao, boolean ocupado, Condominio condominio) {
        this.numero = numero;
        this.area = area;
        this.dataOcupacao = dataOcupacao;
        this.ocupado = ocupado;
        this.condominio = condominio;
    }

    public Apartamento(int codigo, int numero, double area, LocalDate dataOcupacao, boolean ocupado, Condominio condominio) {
        this.id = codigo;
        this.numero = numero;
        this.area = area;
        this.dataOcupacao = dataOcupacao;
        this.ocupado = ocupado;
        this.condominio = condominio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public LocalDate getDataOcupacao() {
        return dataOcupacao;
    }

    public void setDataOcupacao(LocalDate dataOcupacao) {
        this.dataOcupacao = dataOcupacao;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
}
