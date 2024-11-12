package com.jogonba.cartas.cards;
import com.jogonba.cartas.players.Nome;

public abstract class Carta implements Nome {
    private String nome;
    private int custoMana;

    public Carta(String nome, int custoMana){
        this.nome = nome;
        this.custoMana = custoMana;
    }

    //Getters e setters:
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
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
