package com.jogonba.cartas.cards;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Carta {
    Texture textura;
    float x, y;

    private String nome;
    private int custoMana;
    private String tipoEfeito;

    public Carta(String nome, int custoMana, String tipoEfeito, Texture textura){
        this.nome = nome;
        this.custoMana = custoMana;
        this.textura = textura;
        this.tipoEfeito = tipoEfeito;
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

    public String toString(){
        return "Carta: " + nome + ", Custo de Mana: " + custoMana;
    }

    public void setCustoMana(int custoMana){
        this.custoMana = custoMana;
    }
    public int getCustoMana(){
        return custoMana;
    }

    public void setTipoEfeito(String tipoEfeito){
        this.tipoEfeito = tipoEfeito;
    }
    public String getTipoEfeito(){
        return tipoEfeito;
    }

}
