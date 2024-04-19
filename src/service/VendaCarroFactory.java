package src.service;
import src.model.Carro;

public class VendaCarroFactory implements Venda{
    private Carro carro;

    public VendaCarroFactory(String marca, String modelo, int ano) {
        this.carro = new Carro(marca, modelo, ano);
    }

    @Override
    public void venderCarro() {
        System.out.println("Venda realizada com sucesso!");
        System.out.println("Detalhes do carro vendido:");
        System.out.println(carro);
    }
}


