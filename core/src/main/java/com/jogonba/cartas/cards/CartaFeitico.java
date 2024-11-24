package com.jogonba.cartas.cards;

import com.badlogic.gdx.graphics.Texture;

public class CartaFeitico extends Carta {
    private int valor;

    public CartaFeitico(String nome, int custoMana, String tipoEfeito, int valor, Texture textura) {
        super(nome, custoMana, tipoEfeito, textura);
        this.valor = valor;
    }

    public String toString (){
        return super.toString();
    }
}
