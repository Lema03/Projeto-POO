package com.jogonba.cartas.cards;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jogonba.cartas.players.Nome;

public abstract class Carta implements Nome {
    Texture textura;
    float x, y;

    private String nome;
    private int custoMana;

    public Carta(String nome, int custoMana){
        this.nome = nome;
        this.custoMana = custoMana;
    }

    public void render(SpriteBatch batch){
        batch.draw(textura, x, y);
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

    public String toString(){
        return "Carta: " + nome + ", Custo de Mana: " + custoMana;
    }

    public void setCustoMana(){
        this.custoMana = custoMana;
    }
    public int getCustoMana(){
        return custoMana;
    }

}
