package com.jogonba.cartas.cards;

import com.badlogic.gdx.graphics.Texture;

public class CartaFeitico extends Carta {
    private Efeitos efeito;
    private String tipoEfeito;
    private int valor;

    public CartaFeitico(String nome, int custoMana, Efeitos efeito, String tipoEfeito, int valor, Texture textura) {
        super(nome, custoMana, textura);
        this.efeito = efeito;
        this.tipoEfeito = tipoEfeito;
        this.valor = valor;
    }
}
