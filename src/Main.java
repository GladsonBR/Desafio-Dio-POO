import br.com.dio.dominio.*;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean condic = true;
        while (condic == true){

            System.out.println("Digite B para localizar\nDigite S para sair\nI para imprimir modelos cadastrados ");
            String Opcao = leitor.next();


            List<Carro> carroList = new ArrayList<>();
            List<Moto> motosList = new ArrayList<>();

            ImprimirLista imprimirLista = new ImprimirLista();

                Carro carro1 = new Carro("Fiat", "Uno", 2015, 1.0, "GDB1425", 45.0);
                Carro carro2 = new Carro("Volkswagem", "Gol", 2017, 1.6, "HTD", 51.0);

                imprimirLista.getCarros().add(carro1);
                imprimirLista.getCarros().add(carro2);

                Moto moto1 = new Moto("Honda", "Titan", 2013, 125.0, "GTD1253", 16.0);
                Moto moto2 = new Moto("Yamaha", "Faser", 2016, 250.0, "UYD1683", 13.0);


                imprimirLista.getMotos().add(moto1);
                imprimirLista.getMotos().add(moto2);




            if(Opcao.equalsIgnoreCase("B")){
                System.out.println("Digite o modelo para busca");
                String Busca = leitor.next();
                RetornoBusca retornoBusca = new RetornoBusca();
                retornoBusca.RetornuBusca(Busca, imprimirLista);


            }else if (Opcao.equalsIgnoreCase("I")){
                System.out.println(imprimirLista.getCarros().toString());

                System.out.println(imprimirLista.getMotos().toString());

            }else if (Opcao.equalsIgnoreCase("s")){
                condic = false;
            }else{
                System.out.println("Digite uma opção valida");
            }

        }


    }


}
