package com.jogonba.cartas.cards;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jogonba.cartas.players.Jogador;

public class CartaCriatura extends Carta {
    private int ataque;
    private int defesa;

    public CartaCriatura(String nomeCarta, int custoMana, int ataque, int defesa, Texture textura){
        super(nomeCarta, custoMana, textura);
        this.ataque = ataque;
        this.defesa = defesa;
    }

    //Métodos relevantes:
    public void aumentarAtaque(int valor){
        this.ataque += valor;
    }
    public void diminuirAtaque(int valor){
        this.ataque -= valor;
    }
    public void aumentarDefesa(int valor){
        this.defesa += valor;
    }
    public void diminuirDefesa(int valor){
        this.defesa -= valor;
    }

    //Getters e setters:
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque() {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }
    public void setDefesa() {
        this.defesa = defesa;
    }
}
