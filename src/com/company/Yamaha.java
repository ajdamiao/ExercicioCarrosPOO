package com.company;

public class Yamaha extends Veiculo {
    private int velocidadeMaxima = 350;
    private int maximoPassageiros = 2;

    public Yamaha(int passageiros){
        if (passageiros <= 2) {
            this.passageiros = passageiros;
        }

    }


    @Override
    void freiar() {
        while (velocidade != 0) {
            velocidade = velocidade / 5;
        }
        System.out.print("Veiculo parado");
    }


    @Override
    void acelerar() throws VelocidadeAcimaException {
        this.velocidadeMaxima = 351;
        if(velocidadeMaxima > 300)
            throw new VelocidadeAcimaException("Velocidade maxima acima do limite da moto");

    }
}