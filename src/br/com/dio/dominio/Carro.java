package br.com.dio.dominio;

public class Carro extends Veiculos {


    public Carro(String marca, String modelo, Integer ano,Double potencia_cilindrada, String placa, Double qtnTanque  ) {
        super(marca, modelo,ano ,qtnTanque, placa, potencia_cilindrada);
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public Double getQtnTanque() {
        return super.getQtnTanque();
    }

    @Override
    public void setQtnTanque(Double qtnTanque) {
        super.setQtnTanque(qtnTanque);
    }

    @Override
    public Integer getAno() {
        return super.getAno();
    }

    @Override
    public void setAno(Integer ano) {
        super.setAno(ano);
    }

    @Override
    public Double getPotencia_cilindrada() {
        return super.getPotencia_cilindrada();
    }

    @Override
    public void setPotencia_cilindrada(Double potencia_cilindrada) {
        super.setPotencia_cilindrada(potencia_cilindrada);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
