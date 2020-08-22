package com.company;

public class LandRover extends Veiculo {
    private int espacoPortamala;
    private int velocidadeMaxima = 300;
    private int maximopassageiros;

    public LandRover(int passageiros) {
        this.passageiros = passageiros;
    }

    void freiar() {
        while (velocidade != 0) {
            velocidade = velocidade / 2;
        }
        System.out.print("Veiculo parado");
    }

    public void adicionarNoPortaMala() {
        espacoPortamala = espacoPortamala + 10;
    }

    @Override
    void acelerar() throws VelocidadeAcimaException {
        this.velocidadeMaxima = 301;
        if(velocidadeMaxima > 300)
            throw new VelocidadeAcimaException("Velocidade maxima acima do limite do carro");

    }

}