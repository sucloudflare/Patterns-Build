package com.projeto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro.CarroBuilder()
                .setMarca("Toyota")
                .setModelo("Corolla")
                .setAno(2020)
                .setCor("Preto")
                .build();

        System.out.println(carro);
    }
}
