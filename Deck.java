import java.util.ArrayList;

public class Deck {
	
	public ArrayList<Cards> deck1;
	public ArrayList<Cards> deck2;
	
	public Deck() {
		
		deck1 = new ArrayList<>();
		deck1.add(new Jogadores("Michael Jordan", 6, 16, 12, "The GOAT: Ganha +2 de ataque para cada inimigo em campo"));
		deck1.add(new Jogadores("Scottie Pippen", 5, 12, 12, "Contrato barato: No começo dos rounds, o jogador recebe +1 de mana"));
		deck1.add(new Jogadores("Dennis Rodman", 5, 4, 14, "O verme: A cada rodada que passar vivo, aumenta em +1 a defesa de todo o time"));
		deck1.add(new Jogadores("Steve Kerr", 4, 9, 6, "Clutch: Se for jogado nos últimos 3 rounds da partida, ganha +5 de ataque"));
		deck1.add(new Jogadores("Toni Kukoč", 4, 8, 7, "Lobo solitário: Se for jogado sem mais nenhum aliado em campo, ganha +3 de ataque e +3 de defesa"));
		deck1.add(new Jogadores("Ron Harper", 3, 6, 6, ""));
		deck1.add(new Jogadores("Luc Longley", 3, 8, 4, ""));
		deck1.add(new Jogadores("Bill Wennington", 2, 5, 3, ""));
		deck1.add(new Jogadores("Randy Brown", 2, 2, 6, ""));
		deck1.add(new Jogadores("Jud Buechler", 2, 4, 4, ""));
		deck1.add(new Jogadores("Dickey Simpkins", 1, 3, 1, ""));
		deck1.add(new Jogadores("Jason Caffey", 1, 2, 2, ""));
		deck1.add(new Jogadores("James Edwards", 1, 2, 1, ""));
		deck1.add(new Jogadas("Bola de 3", 1, "Causa 3 de dano a qualquer inimigo"));
		deck1.add(new Jogadas("Passe extra", 3, "Ao ser usado em um jogador aliado, sua passiva é ativada novamente"));
		deck1.add(new Jogadas("Bloqueio defensivo", 3, "Impede o ataque de um inimigo por um turno"));
		deck1.add(new Jogadas("Infiltração", 3, "Ao ser usado em um jogador aliado, ele ataca instantaneamente"));
		deck1.add(new Jogadas("Timeout técnico", 3, "Todas as cartas são impedidas de atacar por um turno"));
		deck1.add(new Jogadas("Alley-oop", 1, "Um jogador transfere seu ataque para outro nesse turno"));
		deck1.add(new Jogadas("Falta tática", 3, "Uma carta inimiga é enviada de volta à mão"));
		deck1.add(new Jogadas("Expulsão", 5, "Uma carta inimiga é enviada diretamente ao cemitério"));
		deck1.add(new Jogadas("Camisa aposentada", 3, "Escolha uma carta para voltar do cemitério à mão"));
		deck1.add(new Jogadas("Dia do draft", 3, "Compre 2 cartas"));
		deck1.add(new Taticas("Meditação com Phil Jackson", 4, "Todo o time aliado se concentra, ganhando +5 de ataque por dois turnos"));
		deck1.add(new Taticas("Provocação", 2, "Reduz em -2 a defesa do time inimigo"));
		deck1.add(new Taticas("Clutch time", 2, "Aumenta em o ataque do time aliado em +1; se for usado nos últimos 3 rounds da partida, aumenta em +3"));
		deck1.add(new Taticas("Substituição tática", 2, "Troque uma carta em campo por uma da mão; ela recebe +1 de ataque"));
		deck1.add(new Taticas("Estrela do time", 2, "Um jogador recebe +1 de ataque e defesa para cada carta aliada em campo; todos os aliados perdem -1 de ataque e defesa"));
		deck1.add(new Taticas("Provocação", 2, "Reduz em -2 a defesa do time inimigo"));
		deck1.add(new Taticas("Fast break", 2, "Para cada defesa bem sucedida nesse turno, o time ganha +1 de ataque"));
		
	
		deck2 = new ArrayList<>();
		deck2.add(new Jogadores("LeBron James", 6, 14, 14, "O rei: Aumenta o ataque e a defesa do time aliado em +3"));
		deck2.add(new Jogadores("Dwayne Wade", 5, 16, 8, "Flash: Pelos próximos 3 rounds, esta carta é a primeira a atacar"));
		deck2.add(new Jogadores("Chris Bosh", 5, 12, 12, "Boshassauro: Sempre que uma carta for eliminada, ganha +1 de ataque e defesa"));
		deck2.add(new Jogadores("Ray Allen", 4, 10, 5, "Clutch: Se o jogador tiver menos que 10 de vida, ganha +5 de ataque"));
		deck2.add(new Jogadores("Mario Chalmers", 4, 8, 8, "Defensor incômodo: reduz o ataque de um adversário em -3"));
		deck2.add(new Jogadores("Udonis Haslem", 3, 4, 8, ""));
		deck2.add(new Jogadores("Shane Battier", 3, 6, 6, ""));
		deck2.add(new Jogadores("Mike Miller", 2, 5, 3, ""));
		deck2.add(new Jogadores("Rashard Lewis", 2, 4, 4, ""));
		deck2.add(new Jogadores("Norris Cole", 2, 3, 5, ""));
		deck2.add(new Jogadores("Joel Anthony", 1, 1, 3, ""));
		deck2.add(new Jogadores("Chris Andersen", 1, 3, 1, ""));
		deck2.add(new Jogadores("James Jones", 1, 2, 2, ""));
		deck2.add(new Jogadas("Bola de 3", 1, "Causa 3 de dano a qualquer inimigo"));
		deck2.add(new Jogadas("Passe extra", 3, "Ao ser usado em um jogador aliado, sua passiva é ativada novamente"));
		deck2.add(new Jogadas("Bloqueio defensivo", 3, "Impede o ataque de um inimigo por um turno"));
		deck2.add(new Jogadas("Infiltração", 3, "Ao ser usado em um jogador aliado, ele ataca instantaneamente"));
		deck2.add(new Jogadas("Timeout técnico", 3, "Todas as cartas são impedidas de atacar por um turno"));
		deck2.add(new Jogadas("Alley-oop", 1, "Um jogador transfere seu ataque para outro nesse turno"));
		deck2.add(new Jogadas("Falta tática", 3, "Uma carta inimiga é enviada de volta à mão"));
		deck2.add(new Jogadas("Expulsão", 5, "Uma carta inimiga é enviada diretamente ao cemitério"));
		deck2.add(new Jogadas("Camisa aposentada", 3, "Escolha uma carta para voltar do cemitério à mão"));
		deck2.add(new Jogadas("Dia do draft", 3, "Compre 2 cartas"));
		deck2.add(new Taticas("Motivação com Pat Riley", 4, "Todo o time aliado se concentra, ganhando +5 de ataque por dois turnos"));
		deck2.add(new Taticas("Provocação", 2, "Reduz em -2 a defesa do time inimigo"));
		deck2.add(new Taticas("Clutch time", 2, "Aumenta em o ataque do time aliado em +1; se o player tiver menos que 10 de vida, aumenta em +3"));
		deck2.add(new Taticas("Substituição tática", 2, "Troque uma carta em campo por uma da mão; ela recebe +1 de ataque"));
		deck2.add(new Taticas("Estrela do time", 2, "Um jogador recebe +1 de ataque e defesa para cada carta aliada em campo; todos os aliados perdem -1 de ataque e defesa"));
		deck2.add(new Taticas("Provocação", 2, "Reduz em -2 a defesa do time inimigo"));
		deck2.add(new Taticas("Fast break", 2, "Para cada defesa bem sucedida nesse turno, o time ganha +1 de ataque"));
	}

	

}
