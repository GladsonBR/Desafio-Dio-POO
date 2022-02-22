package br.com.dio.dominio;


import java.util.ArrayList;
import java.util.List;

public class RetornoBusca {


   public void RetornuBusca(String busca, ImprimirLista imprimirLista) {
        List<Veiculos> carroList = new ArrayList<>();
        List<Veiculos> motoList = new ArrayList<>();

        carroList.addAll(imprimirLista.getCarros());
        motoList.addAll(imprimirLista.getMotos());

        for (int i = 0; i < imprimirLista.getCarros().size(); i++) {
            if(carroList.get(i).getModelo().equalsIgnoreCase(busca)){
            System.out.println("Os dados do modelo procurado é: " + carroList.get(i));}
            if(motoList.get(i).getModelo().equalsIgnoreCase(busca)){
                System.out.println("Os dados do modelo procurado é: " + motoList.get(i));}
        }

    }

}
