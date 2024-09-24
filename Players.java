package poo;

import java.util.ArrayList;
import java.util.Collections;

public class Players {

	//Definindo os atributos da classe.
	private String nomePlayer;
	private int vidaPlayer = 30;
	private int quantidadeMana = 1;
	private ArrayList<Cards> deck;
	private ArrayList<Cards> hand;
	private int posicaoBaralho;
	
	//Criando e inicializando o construtor;
	public Players(String nomePlayer, int vidaPlayer, int quantidadeMana) {
		this.nomePlayer = nomePlayer;
		this.vidaPlayer = vidaPlayer;
		this.quantidadeMana = quantidadeMana;
		this.deck = null;
	}
	
	public void setVidaPlayer(int vidaPlayer) {
		this.vidaPlayer = vidaPlayer;
	}
	
	public int getVidaPlayer() {
		return vidaPlayer;
	}
	
	public void setQuantidadeMana(int quantidadeMana) {
		this.quantidadeMana = quantidadeMana;
	}
	
	public int getQuantidadeMana() {
		return quantidadeMana;
	}
	
	public void setDeck(ArrayList<Cards> deck) {
		this.deck = deck;
	}
	
	public ArrayList<Cards> getDeck() {
		return deck;
	}
	
	public void embaralharDeck() {
		Collections.shuffle(deck);
	}
	
	public void puxarMao(ArrayList<Cards> deck) {

		for (int n = 0; n < 5; n++) {
			System.out.println(deck.get(n));
			hand.set(n,(deck.get(n)));
		}
		this.posicaoBaralho = posicaoBaralho;
		for (int posicaoBaralho = 0; posicaoBaralho < 5; posicaoBaralho++) {
			deck.remove(posicaoBaralho);
		}
	}
	
	public ArrayList<Cards> getHand() {
		return hand;
	}
	
	public void setHand(ArrayList<Cards> hand) {
		this.hand = hand;
	}
	
	public void puxarCarta(ArrayList<Cards> deck, ArrayList<Cards> hand) {
		
	}
	
	public void jogarCarta() {}
	
	public void atacar() {}
}
