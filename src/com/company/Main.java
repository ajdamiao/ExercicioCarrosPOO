package com.company;

import java.nio.channels.ScatteringByteChannel;

public class Main {

    public static void main(String[] args) throws PassageirosAcimaException {

        Ferrari f40 = new Ferrari();

        try {
            f40.setPassageiros(5);
        }catch (PassageirosAcimaException e){
            System.out.println("Há passageiros acima do limite");
        }

        LandRover evoque = new LandRover(5);
        Yamaha motoca = new Yamaha(4);
        Manobrista jose = new Manobrista("jose");

        try {
            motoca.acelerar();
        }catch (VelocidadeAcimaException e){
            System.out.println("ERRO: Velocidade acima do limite da moto");
        }

        motoca.pegarVelocidade();

        f40.acelerar();
        f40.pegarVelocidade();
        f40.abrirExaustor();

        evoque.adicionarNoPortaMala();
        try {
            evoque.acelerar();
        }catch(VelocidadeAcimaException e){
            System.out.println("ERRO: Velocidade acima do limite do carro");
        }

        jose.estacionar("jose","f40");
        jose.estacionar("jose","motoca");
        jose.estacionar("jose","evoque");
    }
}