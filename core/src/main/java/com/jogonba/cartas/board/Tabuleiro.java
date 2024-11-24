package com.jogonba.cartas.board;
import com.jogonba.cartas.cards.Carta;
import com.badlogic.gdx.math.Vector2;
import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Carta> slotsTabuleiro;

    public Tabuleiro() {
        this.slotsTabuleiro = new ArrayList<>();
    }

    //Métodos relevantes:
    public Carta removerCarta(int posicao) {
        return slotsTabuleiro.remove(posicao);
    }

    public int verificarPosicao(Carta carta) {
        return slotsTabuleiro.indexOf(carta);
    }

    //metodo incompleto, pois requer interação com jogador
    public Carta escolherCarta(int n) {
        Carta carta = slotsTabuleiro.get(n);
        return carta;
    }

    public boolean lugarOcupado(int posicao) {
        if (slotsTabuleiro.get(posicao) == null) {
            return true;
        } else {
            return false;
        }
    }

    public void colocarCarta(int posicao, Carta carta){
        if (lugarOcupado(posicao)){
            slotsTabuleiro.add (posicao, carta);
        } else {
            System.out.println("O lugar selecionado já está ocupado");
        }
    }

    public void mostrarTabuleiro() {
        for (int n = 0; n < slotsTabuleiro.size(); n++) {
            Carta carta = slotsTabuleiro.get(n);
            System.out.println(carta);
        }
    }

    public int getTabuleiroSize(){
        slotsTabuleiro.trimToSize();
        return slotsTabuleiro.size();
    }

    public ArrayList<com.jogonba.cartas.cards.Carta> getslotsTabuleiro(){
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
