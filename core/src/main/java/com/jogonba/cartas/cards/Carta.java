package com.jogonba.cartas.cards;

public abstract class Carta {
    private String nome;
    private int custoMana;

    public Carta(String nome, int custoMana){
        this.nome = nome;
        this.custoMana = custoMana;
    }

    //Getters e setters:
    public void setNome(){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCustoMana(){
        this.custoMana = custoMana;
    }
    public int getCustoMana(){
        return custoMana;
    }
}
