package br.com.dio.dominio;

import java.util.*;

public abstract class Veiculos {

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getQtnTanque() {
        return qtnTanque;
    }

    public void setQtnTanque(Double qtnTanque) {
        this.qtnTanque = qtnTanque;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getPotencia_cilindrada() {
        return potencia_cilindrada;
    }

    public void setPotencia_cilindrada(Double potencia_cilindrada) {
        this.potencia_cilindrada = potencia_cilindrada;
    }

    public Veiculos(String marca, String modelo, Integer ano,Double potencia_cilindrada, String placa, Double qtnTanque ) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.qtnTanque = qtnTanque;
        this.ano = ano;
        this.potencia_cilindrada = potencia_cilindrada;
    }

    @Override
    public String toString() {
        return "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", qtnTanque=" + qtnTanque +
                ", ano=" + ano +
                ", potencia_cilindrada=" + potencia_cilindrada;
    }

    private String placa;
    private String marca;
    private String modelo;
    private Double qtnTanque;
    private Integer ano;
    private Double potencia_cilindrada;



}
