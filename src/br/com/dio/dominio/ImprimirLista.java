package br.com.dio.dominio;

import java.util.ArrayList;
import java.util.List;

public class ImprimirLista {
    @Override
    public String toString() {
        return "ImprimirLista{" +
                "carros=" + carros +
                ", motos=" + motos +
                '}';
    }

    List<Carro> carros = new ArrayList<>();
    List<Moto> motos = new ArrayList<>();

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }


    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }


}
