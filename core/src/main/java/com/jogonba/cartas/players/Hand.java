package com.jogonba.cartas.players;

import java.util.ArrayList;
import com.jogonba.cartas.cards.Carta;

public class Hand {
    private ArrayList<Carta> cartasHand;

    public Hand(){
        this.cartasHand = new ArrayList<>();
    }

    //Métodos relevantes:
    public void comprarCarta(Deck deck){
        Carta cartaRemovida = deck.removerCarta();
        cartasHand.add(cartaRemovida);
    }

    public Carta removerCarta(int posicao){
        return cartasHand.remove(posicao);
    }

    public void devolverCarta(int posicao, Carta carta){
        cartasHand.add(posicao, carta);
    }

    public void mostrarHand() {
        for (int n = 0; n < cartasHand.size(); n++) {
            Carta carta = cartasHand.get(n);
            System.out.println(carta);
        }
    }

    public Carta escolherCarta(int n) {
        Carta carta = cartasHand.get(n);
        return carta;
    }

    public ArrayList<Carta> getCartasHand(){
        return cartasHand;
    }
}