package com.company;

public class Manobrista {

    private String nome;

    public Manobrista(String nome) {
        this.nome = nome;
    }

    void estacionar(String nome, String veiculo)
    {
        System.out.println(nome + " estacionou o " + veiculo);
    }
}