package com.jogonba.cartas.board;
import com.jogonba.cartas.cards.Carta;
import com.badlogic.gdx.math.Vector2;
import java.util.ArrayList;
import java.util.Scanner;

public class Tabuleiro {
    private ArrayList<Carta> slotsTabuleiro;
    Scanner scanner = new Scanner(System.in);

    public Tabuleiro() {
        this.slotsTabuleiro = new ArrayList<>();
    }

    //Métodos relevantes:
    public Carta removerCarta(int posicao) {
        Carta carta = slotsTabuleiro.get(posicao);
        slotsTabuleiro.set(posicao, null);
        return carta;
    }

    public int verificarPosicao(Carta carta) {
        return slotsTabuleiro.indexOf(carta);
    }

    public Carta escolherCarta(int n) {
        return slotsTabuleiro.get(n);
    }

    public void preencherTabuleiro(){
        while (slotsTabuleiro.size() <= 4) {
            slotsTabuleiro.add(null);
        }
    }

    public boolean lugarVazio(int posicao) {
        if (slotsTabuleiro.get(posicao) == null) {
            return true;
        } else {
            return false;
        }
    }

    public int tabuleiroOcupado(){
        int lugaresVazios = 0;
        for (int i = 0; i < 5; i++){
            lugarVazio(i);
            if (lugarVazio(i)){
                lugaresVazios++;
            }
        }
        return lugaresVazios;
    }

    public void colocarCarta(int posicao, Carta carta){
        while (!lugarVazio(posicao)){
            System.out.println("O lugar selecionado já está ocupado.");
            System.out.println("Escolha outra posição para jogar.");
            posicao = Integer.parseInt(scanner.nextLine());
        }
        slotsTabuleiro.set(posicao, carta);
    }

    public void mostrarTabuleiro() {
        for (int n = 0; n < slotsTabuleiro.size(); n++) {
            Carta carta = slotsTabuleiro.get(n);
            System.out.println(carta);
        }
    }

    public ArrayList<com.jogonba.cartas.cards.Carta> getSlotsTabuleiro(){
        return slotsTabuleiro;
    }



}
