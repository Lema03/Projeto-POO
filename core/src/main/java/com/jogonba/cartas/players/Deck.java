package com.jogonba.cartas.players;
import java.util.LinkedList;
import java.util.Collections;
import com.jogonba.cartas.cards.Carta;

public class Deck {
    private LinkedList<Carta> cartasDeck;

    public Deck(){
        this.cartasDeck = new LinkedList<>();
    }

    //Métodos relevantes:
    public void embaralharCartas(){
        Collections.shuffle(cartasDeck);
    }
    public Carta removerCarta(){
        return cartasDeck.poll();
    }

    public boolean estaVazio (){
        return cartasDeck.isEmpty();
    }
}
