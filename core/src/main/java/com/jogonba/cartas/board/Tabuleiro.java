package com.jogonba.cartas.board;
import com.badlogic.gdx.math.Vector2;
import com.jogonba.cartas.cards.Carta;
import com.jogonba.cartas.players.Deck;
import com.jogonba.cartas.players.Jogador;
import com.jogonba.cartas.players.Hand;
import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Carta> slotsTabuleiro;
    private ArrayList<Vector2> slotsPosicao;

    public Tabuleiro() {
        this.slotsTabuleiro = new ArrayList<>();
        this.slotsPosicao = new ArrayList<>();
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

    public ArrayList<Carta> getslotsTabuleiro(){
        return slotsTabuleiro;
    }

    public void criarPosicoesCB() {
        for (int i = 0; i < 5; i++) {
            slotsPosicao.add(new Vector2(300, 100 * i + 120));
        }
    }

    public void criarPosicoesMH() {
        for (int i = 0; i < 5; i++) {
            slotsPosicao.add(new Vector2(100, 100 * i + 120));
        }
    }
}
