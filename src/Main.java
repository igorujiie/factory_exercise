package src;

import src.service.VendaCarroFactory;
import src.service.Venda;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da fábrica de venda de carros
        Venda vendaCarro = new VendaCarroFactory("Toyota", "Corolla", 2022);
        // Realizando a venda
        vendaCarro.venderCarro();
    }
}
