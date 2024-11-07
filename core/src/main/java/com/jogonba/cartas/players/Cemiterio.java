package com.jogonba.cartas.players;
import java.util.ArrayList;
import com.jogonba.cartas.cards.Carta;

public class Cemiterio {
    private ArrayList<Carta> cartasCemiterio;

    public Cemiterio(){
        this.cartasCemiterio = new ArrayList<>();
    }

    //Métodos relevantes:
    public void adicionarCarta(Carta carta){
        cartasCemiterio.add(carta);
    }
}
