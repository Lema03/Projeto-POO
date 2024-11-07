package com.jogonba.cartas.board;
import com.jogonba.cartas.cards.Carta;
import com.jogonba.cartas.players.Deck;
import com.jogonba.cartas.players.Jogador;
import com.jogonba.cartas.players.Hand;
import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Carta> slotsTabuleiro;

    public Tabuleiro() {
        this.slotsTabuleiro = new ArrayList<>();
    }

    //Métodos relevantes:
    public void colocarCarta(Carta carta){
        slotsTabuleiro.add(carta);
    }

    public Carta removerCarta(int posicao) {
        return slotsTabuleiro.remove(posicao);
    }

    public int verificarPosicao(Carta carta){
        return slotsTabuleiro.indexOf(carta);
    }
}
