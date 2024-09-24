

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Gameplay {

	private Scanner scanner;
	private Random random;
	private String nomePlayer1;
	private String nomePlayer2;
	private int escolha;
	private int numeroAleatorio;
	private int numero;
	private String vencedorSorteio;
	private int deckEscolhido;


	Players player1 = new Players(nomePlayer1, 100, 1);
	Players player2 = new Players(nomePlayer2, 100, 1);
	
	Deck deckPlayer1 = new Deck();
	Deck deckPlayer2 = new Deck();
	
	Hand handPlayer1 = new Hand();
	Hand handPlayer2 = new Hand();
	
	Tabuleiro tabuleiroPlayer1 = new Tabuleiro();
	Tabuleiro tabuleiroPlayer2 = new Tabuleiro();

	
	public Gameplay() {
		this.random = new Random();
		this.scanner = new Scanner(System.in);
	}
	
	public int Sorteio() {
		numeroAleatorio = random.nextInt(11) + 1;
		if (numeroAleatorio % 2 == 0) {
			numero = 2;
		} else {
			numero = 1;
		}
		return numero;
	}
	
	public String ResultadoSorteio(int escolha, int numero, int numeroAleatorio) {
		this.escolha = escolha;
		this.numero = numero;
		this.numeroAleatorio = numeroAleatorio;
		if (escolha == numero) {
			System.out.println("O número sorteado foi " + numeroAleatorio + ", portanto, " + nomePlayer1 + " começa jogando!");
			vencedorSorteio = nomePlayer1;
		} else {
			System.out.println("O número sorteado foi " + numeroAleatorio + ", portanto, " + nomePlayer2 + " começa jogando!");
			vencedorSorteio = nomePlayer2;
		}
		return vencedorSorteio;
	}
	
	public void EscolhaDeck(int deckEscolhido) {
		this.deckEscolhido = deckEscolhido;
		if (vencedorSorteio == nomePlayer1) {
			if (deckEscolhido == 1) {
				player1.setDeck(deckPlayer1.deck1);
				player2.setDeck(deckPlayer2.deck2);
				System.out.println(nomePlayer1 + " ficou com o Chicago Bulls e " + nomePlayer2 + " ficou com o Miami Heat.");
			} else {
				player1.setDeck(deckPlayer1.deck2);
				player2.setDeck(deckPlayer2.deck1);
				System.out.println(nomePlayer1 + " ficou com o Miami Heat e " + nomePlayer2 + " ficou com o Chicago Bulls.");
			}
		} else {
			if (deckEscolhido == 1) {
				player2.setDeck(deckPlayer2.deck1);
				player1.setDeck(deckPlayer1.deck2);
				System.out.println(nomePlayer2 + " ficou com o Chicago Bulls e " + nomePlayer1 + " ficou com o Miami Heat.");
			} else {
				player2.setDeck(deckPlayer2.deck2);
				player1.setDeck(deckPlayer1.deck1);
				System.out.println(nomePlayer2 + " ficou com o Miami Heat e " + nomePlayer1 + " ficou com o Chicago Bulls.");
			}
		}
	}
	
	public void inicioGameplay() {
		
		System.out.println("================================= BEM VINDO À QUADRA =================================");
		System.out.println(" ");
		System.out.println("Primero, as apresentações. Digitem seus apelidos, GMs!");
		System.out.print("GM 1: ");
		nomePlayer1 = scanner.nextLine();
		System.out.print("GM 2: ");
		nomePlayer2 = scanner.nextLine();
		System.out.println(" ");
		System.out.println("Agora, vamos ver quem joga primeiro!");
		System.out.println("Escolha [1] para ÍMPAR ou [2] para PAR, " + nomePlayer1 + ".");
		escolha = scanner.nextInt();
		Sorteio();
		ResultadoSorteio(escolha, numero, numeroAleatorio);
		System.out.println(" ");
		System.out.println("Hora da escolha dos decks!");
		System.out.println("Como " + vencedorSorteio + " ganhou o sorteio, terá o direito de escolher o deck primeiro!");
		System.out.println("Digite [1] para escolher Chicago Bulls do Jordan ou [2] para escolher o Miami Heat do Lebron," + vencedorSorteio + ".");
		deckEscolhido = scanner.nextInt();
		EscolhaDeck (deckEscolhido);
		System.out.println(" ");
		System.out.println("================================== Agora, JUMPBALL! ==================================");
	}
	
	public void Partida() {
		
		System.out.println("A primeira fase consiste no embaralhamento das cartas do deck.");
		player1.embaralharDeck();
		player2.embaralharDeck();
		System.out.println("Agora, vamos receber as cartas!");
		player1.puxarMaoInicial(player1.getDeck(), player1.getCountDeck());
		System.out.println("\nCartas do jogador 2: ");
		player2.puxarMaoInicial(player2.getDeck(), player2.getCountDeck());
		System.out.println("Ambos os jogadores começam com 30 pontos de vida e 1 ponto de mana.");
		System.out.println("O jogo acaba quando um dos jogadores fica sem vida ou sem cartas disponíveis para compra.");
		player1.jogarCarta(player1.getHand());
		
	}
	
	

}
