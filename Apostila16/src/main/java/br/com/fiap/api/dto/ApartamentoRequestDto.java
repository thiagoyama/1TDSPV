package br.com.fiap.api.dto;

import br.com.fiap.api.model.Condominio;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class ApartamentoRequestDto {

    @Positive
    private int numero;

    @Positive
    private double area;

    @Past
    private LocalDate dataOcupacao;

    private boolean ocupado;

    private CondominioRequestDto condominio;

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

    public CondominioRequestDto getCondominio() {
        return condominio;
    }

    public void setCondominio(CondominioRequestDto condominio) {
        this.condominio = condominio;
    }
}
