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


}
