
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Players {

	//Definindo os atributos da classe.
	private String nomePlayer;
	private int vidaPlayer = 30;
	private int quantidadeMana = 1;
	private ArrayList<Cards> deck = new ArrayList<>(); 
	private ArrayList<Cards> hand = new ArrayList<>();
	private int countDeck = 5;
	private ArrayList<Cards> tabuleiro = new ArrayList<>();
	private Scanner scanner;
	
	
	//Criando e inicializando o construtor;
	public Players(String nomePlayer, int vidaPlayer, int quantidadeMana) {
		this.nomePlayer = nomePlayer;
		this.vidaPlayer = vidaPlayer;
		this.quantidadeMana = quantidadeMana;
		this.deck = null;
		scanner = new Scanner(System.in);
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
	
	public int getCountDeck() {
		return countDeck;
	}
	
	public void setCountDeck(int countDeck) {
		this.countDeck = countDeck;
	}
	
	public void puxarMaoInicial(ArrayList<Cards> deck, int countDeck) {
			hand.addAll(deck.subList(0, countDeck));
			for (int n = 0; n < countDeck; n++) {
				System.out.println(hand.get(n));
			}
	}
	
	public void tamanhoTab() {
		tabuleiro.ensureCapacity(15);
	}
	
	public void puxarCarta(ArrayList<Cards> deck, int countDeck) {
		hand.addAll(deck.subList(countDeck, ++countDeck));
		System.out.println(hand);
	}
	
	public ArrayList<Cards> getHand() {
		return hand;
	}
	
	public void setHand(ArrayList<Cards> hand) {
		this.hand = hand;
	}
	
	public void jogarCarta(ArrayList<Cards> hand) {
		System.out.println("Selecione a carta que deseja jogar: ");
		int posicaoCarta = scanner.nextInt();
		Cards cartaTabuleiro = hand.get(posicaoCarta);
		tabuleiro.add(cartaTabuleiro);
		hand.remove(posicaoCarta);
		System.out.println("Mão: " + hand);
		System.out.println("Tabuleiro: " + tabuleiro);
	}
	
	public ArrayList<Cards> getTabuleiro() {
		return tabuleiro;
	}
	
	public void setTabuleiro(ArrayList<Cards> tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public void atacar() {}
}
























