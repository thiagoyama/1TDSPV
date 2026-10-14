package br.com.fiap.api.dto;

import java.time.LocalDate;

public class ApartamentoResponseDto {

    private int id;
    private int numero;
    private double area;
    private LocalDate dataOcupacao;
    private boolean ocupado;
    private CondominioResponseDto condominio;

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

    public CondominioResponseDto getCondominio() {
        return condominio;
    }

    public void setCondominio(CondominioResponseDto condominio) {
        this.condominio = condominio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
