package com.jogonba.cartas.board;
import com.badlogic.gdx.math.Vector2;
import com.jogonba.cartas.cards.Carta;
import com.jogonba.cartas.players.Deck;
import com.jogonba.cartas.players.Jogador;
import com.jogonba.cartas.players.Hand;
import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Carta> slotsTabuleiroJogador1;
    private ArrayList<Carta> slotsTabuleiroJogador2;
    private ArrayList<Vector2> slotsPosicaoJogador1;
    private ArrayList<Vector2> slotsPosicaoJogador2;

    public Tabuleiro() {
        this.slotsTabuleiroJogador1 = new ArrayList<>();
        this.slotsTabuleiroJogador2 = new ArrayList<>();
        this.slotsPosicaoJogador1 = new ArrayList<>();
        this.slotsPosicaoJogador2 = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            slotsPosicaoJogador1.add(new Vector2(300, 100 * i + 120));
        }
        for (int i = 0; i < 5; i++) {
            slotsPosicaoJogador2.add(new Vector2(100, 100 * i + 120));
        }
    }

    //Métodos relevantes:
    public void colocarCartaJogador1(Carta carta){
        slotsTabuleiro.add(carta);
    }

    public Carta removerCarta(int posicao) {
        return slotsTabuleiro.remove(posicao);
    }

    public int verificarPosicao(Carta carta){
        return slotsTabuleiro.indexOf(carta);
    }

    public ArrayList<Carta> getslotsTabuleiro(){
        return slotsTabuleiro;
    }
}
