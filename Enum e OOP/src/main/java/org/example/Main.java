package org.example;

public class Main {
    public static void main(String[] args) {
        //itera sobre o enum estado brasileiro mostrando seu nomes siglas e seu numero de IBGE.
            for(EstadoBrasileiro e: EstadoBrasileiro.values()){
                System.out.println(e.getSigla() + "-" + e.getNome() + "-" + e.getIBGE());
            }

            System.out.println("----------------------------------");
            //Esse eb representa o estado do piaui dentro do ENUM
            EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
            System.out.println(eb.getNome());
            System.out.println(eb.getSigla());
            System.out.println(eb.getIBGE());


    }
}