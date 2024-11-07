package com.jogonba.cartas.cards;

public class CartaFeitico extends Carta {
    private Efeitos efeito;
    private String tipoEfeito;
    private int valor;

    public CartaFeitico(String nome, int custoMana, Efeitos efeito, String tipoEfeito, int valor) {
        super(nome, custoMana);
        this.efeito = efeito;
        this.tipoEfeito = tipoEfeito;
        this.valor = valor;
    }
}
