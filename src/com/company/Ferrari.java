package com.company;

import java.util.regex.PatternSyntaxException;

public class Ferrari extends Veiculo {
    private int velocidadeMaxima = 450;

    @Override
    public void setPassageiros(int passageiros) throws PassageirosAcimaException {
        this.passageiros = passageiros;
        if(passageiros > 4){
            throw new PassageirosAcimaException("Há passageiro acima do limite");
        }

    }

    @Override
    void acelerar() {
        try {
            while (velocidade != velocidadeMaxima) {
                velocidade = velocidade + 10;
            }
        }catch(NullPointerException e){
            System.out.print("ERRO: Velocidade maxima do veiculo Ferrari alcancada");
        }
    }

    void freiar() {
        while (velocidade != 0) {
            velocidade = velocidade / 3;
        }
        System.out.print("Veiculo parado");
    }

    void abrirExaustor()
    {
        System.out.println("Exaustor aberto.");
    }

}