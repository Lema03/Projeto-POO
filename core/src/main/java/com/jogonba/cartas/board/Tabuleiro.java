package com.jogonba.cartas.board;
import com.jogonba.cartas.cards.Carta;
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
}
