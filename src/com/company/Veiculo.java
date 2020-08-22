package com.company;

public abstract class Veiculo {
    protected int passageiros;
    protected int velocidade = 0;

    void acelerar() throws VelocidadeAcimaException {
        velocidade = velocidade+10;
    }

    void freiar()
    {
        velocidade = velocidade - 10;
    }

    void pegarVelocidade()
    {
        System.out.println("O carro esta a " + velocidade + "Km/h");
    }

    public void setPassageiros(int passageiros) throws PassageirosAcimaException {
        this.passageiros = passageiros;
    }
}