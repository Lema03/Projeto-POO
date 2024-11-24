package com.jogonba.cartas.players;
import java.util.Scanner;
import com.jogonba.cartas.board.ManaInsuficienteException;
import com.jogonba.cartas.board.Tabuleiro;
import com.jogonba.cartas.cards.Carta;
import com.jogonba.cartas.cards.CartaCriatura;

public class Jogador implements Nome{
    private String nome;
    private int identificador;
    private int vida;
    private int mana;
    private boolean vivo;
    private Hand hand;
    Deck deck;
    private Cemiterio cemiterio;
    Tabuleiro tabuleiro;
    DeckLibrary dl;
    Scanner scanner = new Scanner(System.in);
    private Carta cartaRemovida;

    public Jogador(int identificador){
        this.identificador = identificador;
        this.vida = 50;
        this.mana = 1;
        this.vivo = true;
        this.hand = new Hand();
        this.cemiterio = new Cemiterio();
        this.deck = new Deck();
        this.dl = new DeckLibrary();
    }

    //Métodos relevantes:
    public void diminuirVida(int valor){
        this.vida -= valor;
    }
    public void diminuirMana(int valor){
        this.mana -= valor;
    }
    public void aumentarMana(int valor){
        this.mana += valor;
    }

    public void jogarCarta (int posicaoHand) throws ManaInsuficienteException{
        if (tabuleiro.getTabuleiroSize() < 5) {
            this.cartaRemovida = hand.removerCarta(posicaoHand);
            int quantMana = cartaRemovida.getCustoMana();
            if (quantMana > this.mana) {
                throw new ManaInsuficienteException("Mana insuficiente!");
                /*System.out.println (e.getMessage());
                hand.devolverCarta (posicaoHand, cartaRemovida);*/
            } else {
                System.out.println("Escolha em qual posição do tabuleiro deseja jogar");
                int posicao = scanner.nextInt();
                diminuirMana(quantMana);
                tabuleiro.colocarCarta(posicao, cartaRemovida);
            }
        } else {
            System.out.println("O tabuleiro está completo.");
        }
    }

    public void removerCarta (int posicaoTabuleiro){
        Carta cartaRemovida = tabuleiro.removerCarta (posicaoTabuleiro);
        cemiterio.adicionarCarta (cartaRemovida);
    }

    public void atacar (CartaCriatura cartaAtacante, CartaCriatura cartaOponente, Jogador jogadorOponente){
        if (cartaAtacante.getAtaque() >= cartaOponente.getDefesa()){
            int dano = cartaAtacante.getAtaque() - cartaOponente.getDefesa();
            jogadorOponente.diminuirVida(dano);
            int posicaoTabuleiro = tabuleiro.verificarPosicao(cartaOponente);
            jogadorOponente.removerCarta(posicaoTabuleiro);
        } else {
            cartaOponente.diminuirDefesa(cartaAtacante.getAtaque());
        }
    }

    public void puxarHandInicial(){
        for (int i = 0; i < 5; i++){
            hand.comprarCarta(deck);
        }
    }

    public void mostrarHand(){
        hand.mostrarHand();
    }

    public Carta escolherCarta (int n){
        return tabuleiro.escolherCarta(n);
    }




    //Fases do jogador:
    public void faseCompra(){
        hand.comprarCarta(deck);
    }

    public void faseMana (int turno){
        if (this.mana <= 10){
            this.mana = turno;
        } else {
            this.mana = 10;
        }
    }

    public void fasePosicionamento(){
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha qual carta quer jogar");
            int posicao = scanner.nextInt();
            try {
                jogarCarta(posicao);
            } catch (ManaInsuficienteException e){
                System.out.println (e.getMessage());
                hand.devolverCarta (posicao, cartaRemovida);
            }
            finally {
                System.out.println("Deseja jogar  outra carta? [S/N]");
                String escolhaCont = scanner.nextLine();
                if (escolhaCont.equalsIgnoreCase("n")) {
                    continuar = false;
                }
            }
        }
        tabuleiro.mostrarTabuleiro();
    }

    public void faseCombate (){
        boolean continuar = true;
        System.out.println("Deseja atacar o adversário? [S/N]");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("n")){
            continuar = false;
        }
        while (continuar){
            System.out.println("Escolha qual carta irá atacar: ");
            CartaCriatura cartaAtaque = null;
            int escolha = scanner.nextInt();
            Carta carta = tabuleiro.escolherCarta(escolha);
            if (carta instanceof CartaCriatura){
                cartaAtaque = (CartaCriatura) carta;
            } else {

            }
            System.out.println("Agora, escolha qual carta do oponente você deseja atacar: ");

            atacar(cartaAtaque);
        }
    }

    //Parte gráfica
    public void criarPosicoesCB(){
        tabuleiro.criarPosicoesCB();
    }

    public void criarPosicoesMH(){
        tabuleiro.criarPosicoesMH();
    }


    //Condições de vitória:
    public void isVivo(){
        if (vida < 0){
            this.vivo = false;
        }
    }
    public boolean semCartas (){
        return deck.estaVazio();
    }


    //Getters e setters:
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVida() {
        return vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getMana() {
        return mana;
    }

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String getNome(){
        return nome;
    }

    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public Hand getHand(){
        return hand;
    }

    public Deck getDeck(){
        return deck;
    }

    public void setDeck(Deck deck){
        this.deck = deck;
    }

    public Cemiterio getCemiterio(){
        return cemiterio;
    }

    public boolean getVivo(){
        return vivo;
    }
}
