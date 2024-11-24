package com.jogonba.cartas.players;
import com.badlogic.gdx.graphics.Texture;
import com.jogonba.cartas.cards.*;
import java.util.Collections;
import java.util.LinkedList;

public class DeckLibrary {
    private Deck deck1;
    private Deck deck2;
    LinkedList<Carta> cartasDeck;

    public DeckLibrary() {

        this.deck1 = new Deck();
        this.deck2 = new Deck();


        //Deck 1
        deck1.cartasDeck.add(new CartaCriatura("Michael Jordan", 6, 16, 12, "The GOAT: Ganha +2 de ataque para cada inimigo em campo", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Scottie Pippen", 5, 12, 12, "Contrato barato: No começo dos rounds, o jogador recebe +1 de mana", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Dennis Rodman", 5, 4, 14, "O verme: A cada rodada que passar vivo, aumenta em +1 a defesa de todo o time", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Steve Kerr", 4, 9, 6, "Clutch: Se for jogado nos últimos 3 rounds da partida, ganha +5 de ataque", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Toni Kukoč", 4, 8, 7, "Lobo solitário: Se for jogado sem mais nenhum aliado em campo, ganha +3 de ataque e +3 de defesa", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Ron Harper", 3, 6, 6, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Luc Longley", 3, 8, 4, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Bill Wennington", 2, 5, 3, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Randy Brown", 2, 2, 6, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Jud Buechler", 2, 4, 4, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Dickey Simpkins", 1, 3, 1, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("Jason Caffey", 1, 2, 2, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaCriatura("James Edwards", 1, 2, 1, "", new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Bola de 3", 1, "Causa 3 de dano a qualquer inimigo", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Passe extra", 3, "Ao ser usado em um jogador aliado, sua passiva é ativada novamente", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Bloqueio defensivo", 3, "Impede o ataque de um inimigo por um turno", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Infiltração", 3, "Ao ser usado em um jogador aliado, ele ataca instantaneamente", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Timeout técnico", 3, "Todas as cartas são impedidas de atacar por um turno", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Alley-oop", 1, "Um jogador transfere seu ataque para outro nesse turno", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Falta tática", 3, "Uma carta inimiga é enviada de volta à mão", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Expulsão", 5, "Uma carta inimiga é enviada diretamente ao cemitério", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Camisa aposentada", 3, "Escolha uma carta para voltar do cemitério à mão", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaFeitico("Dia do draft", 3, "Compre 2 cartas", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaEncantamento("Meditação com Phil Jackson", 4, "Todo o time aliado se concentra, ganhando +5 de ataque por dois turnos", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaEncantamento("Provocação", 2, "Reduz em -2 a defesa do time inimigo", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaEncantamento("Clutch time", 2, "Aumenta em o ataque do time aliado em +1; se for usado nos últimos 3 rounds da partida, aumenta em +3", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaEncantamento("Substituição tática", 2, "Troque uma carta em campo por uma da mão; ela recebe +1 de ataque", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaEncantamento("Estrela do time", 2, "Um jogador recebe +1 de ataque e defesa para cada carta aliada em campo; todos os aliados perdem -1 de ataque e defesa", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaEncantamento("Provocação", 2, "Reduz em -2 a defesa do time inimigo", 0, new Texture("placeholder.jpg")));
        deck1.cartasDeck.add(new CartaEncantamento("Fast break", 2, "Para cada defesa bem sucedida nesse turno, o time ganha +1 de ataque", 0, new Texture("placeholder.jpg")));


        //Deck 2
        deck2.cartasDeck.add(new CartaCriatura("LeBron James", 6, 15, 15, "The King: Ganha +2 de defesa para cada carta aliada em campo", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Dwyane Wade", 5, 14, 11, "Flash: Quando atacar, pode atacar duas vezes por turno.", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Chris Bosh", 5, 13, 10, "Silencioso: Ganha +1 de ataque e +1 de defesa a cada turno.", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Ray Allen", 4, 10, 8, "Clutch Shooter: Quando entra em campo, causa 3 de dano direto ao oponente.", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Shane Battier", 4, 9, 9, "Defensor Implacável: Ganha +2 de defesa contra criaturas inimigas com mais de 10 de ataque.", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Mario Chalmers", 3, 7, 5, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Mike Miller", 3, 6, 5, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Udonis Haslem", 2, 4, 3, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Norris Cole", 2, 5, 1, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Joel Anthony", 2, 2, 4, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Rashard Lewis", 1, 2, 2, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("Chris Andersen", 1, 1, 2, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaCriatura("James Jones", 1, 2, 1, "", new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Bola de 3", 1, "Causa 3 de dano a qualquer inimigo", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Passe extra", 3, "Ao ser usado em um jogador aliado, sua passiva é ativada novamente", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Bloqueio defensivo", 3, "Impede o ataque de um inimigo por um turno", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Infiltração", 3, "Ao ser usado em um jogador aliado, ele ataca instantaneamente", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Timeout técnico", 3, "Todas as cartas são impedidas de atacar por um turno", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Alley-oop", 1, "Um jogador transfere seu ataque para outro nesse turno", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Falta tática", 3, "Uma carta inimiga é enviada de volta à mão", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Expulsão", 5, "Uma carta inimiga é enviada diretamente ao cemitério", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Camisa aposentada", 3, "Escolha uma carta para voltar do cemitério à mão", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaFeitico("Dia do draft", 3, "Compre 2 cartas", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaEncantamento("Meditação com Phil Jackson", 4, "Todo o time aliado se concentra, ganhando +5 de ataque por dois turnos", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaEncantamento("Provocação", 2, "Reduz em -2 a defesa do time inimigo", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaEncantamento("Clutch time", 2, "Aumenta em o ataque do time aliado em +1; se for usado nos últimos 3 rounds da partida, aumenta em +3", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaEncantamento("Substituição tática", 2, "Troque uma carta em campo por uma da mão; ela recebe +1 de ataque", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaEncantamento("Estrela do time", 2, "Um jogador recebe +1 de ataque e defesa para cada carta aliada em campo; todos os aliados perdem -1 de ataque e defesa", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaEncantamento("Provocação", 2, "Reduz em -2 a defesa do time inimigo", 0, new Texture("placeholder.jpg")));
        deck2.cartasDeck.add(new CartaEncantamento("Fast break", 2, "Para cada defesa bem sucedida nesse turno, o time ganha +1 de ataque", 0, new Texture("placeholder.jpg")));
    }

    public Deck getDeck1(){
        return deck1;
    }
    public Deck getDeck2(){
        return deck2;
    }

    public void embaralharCartas1(){
        deck1.shuffle();
    }

    public void embaralharCartas2(){
        deck2.shuffle();
    }

    public LinkedList<Carta> getCartasDeck(){
        return cartasDeck;
    }

}
