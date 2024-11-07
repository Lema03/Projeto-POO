package com.jogonba.cartas.cards;

public class Efeitos {
    public void aumentarAtaque(CartaCriatura criatura, int valor) {
        criatura.aumentarAtaque(valor);
    }

    public void diminuirAtaque(CartaCriatura criatura, int valor) {
        criatura.diminuirAtaque(valor);
    }

    public void aumentarDefesa(CartaCriatura criatura, int valor) {
        criatura.aumentarDefesa(valor);
    }

    public void diminuirDefesa(CartaCriatura criatura, int valor) {
        criatura.diminuirDefesa(valor);
    }

    //Outros efeitos...
}
