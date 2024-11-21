package com.jogonba.cartas.cards;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Carta {
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
    public void setNome(String nome){
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
