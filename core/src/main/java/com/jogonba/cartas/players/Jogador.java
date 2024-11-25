package com.jogonba.cartas.players;
import java.util.ArrayList;
import java.util.Scanner;
import com.jogonba.cartas.board.ManaInsuficienteException;
import com.jogonba.cartas.board.Tabuleiro;
import com.jogonba.cartas.cards.Carta;
import com.jogonba.cartas.cards.CartaCriatura;

public class Jogador{
    private String nome;
    private int identificador;
    private int vida;
    private int mana;
    private boolean vivo;
    Hand hand;
    Deck deck;
    Cemiterio cemiterio;
    Tabuleiro tabuleiro;
    DeckLibrary dl;
    Scanner scanner = new Scanner(System.in);
    private Carta cartaRemovida;
    private Jogador oponente;
    private boolean continuar = true;

    public Jogador(int identificador){
        this.identificador = identificador;
        this.vida = 50;
        this.mana = 1;
        this.vivo = true;
        this.hand = new Hand();
        this.cemiterio = new Cemiterio();
        this.deck = new Deck();
        this.dl = new DeckLibrary();
        this.tabuleiro = new Tabuleiro();
    }

    //Métodos relevantes:
    public void diminuirVida(int valor){
        this.vida -= valor;
        System.out.println(this.vida);
    }
    public void diminuirMana(int valor){
        this.mana -= valor;
        System.out.println(this.mana);
    }
    public void aumentarMana(int valor){
        this.mana += valor;
    }

    public void jogarCarta (int posicaoHand) throws ManaInsuficienteException{
        if (tabuleiro.tabuleiroOcupado() != 0) {
            this.cartaRemovida = hand.removerCarta(posicaoHand);
            int quantMana = cartaRemovida.getCustoMana();
            if (this.mana == 0) {
                System.out.println("Sem mana disponível.");
            } else if (quantMana > this.mana) {
                throw new ManaInsuficienteException("Mana insuficiente!");
            } else {
                System.out.println("Escolha em qual posição do tabuleiro deseja jogar");
                int posicao = Integer.parseInt(scanner.nextLine());
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

    public void atacarCarta (CartaCriatura cartaAtacante, CartaCriatura cartaOponente, Jogador jogadorOponente){
        if (cartaAtacante.getAtaque() >= cartaOponente.getDefesa()){
            int posicaoTabuleiro = jogadorOponente.getTabuleiro().verificarPosicao(cartaOponente);
            int dano = cartaAtacante.getAtaque() - cartaOponente.getDefesa();
            jogadorOponente.diminuirVida(dano);
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

    public void ataqueDireto (CartaCriatura cartaAtaque, Jogador oponente){
        int dano = cartaAtaque.getAtaque();
        oponente.diminuirVida(dano);
        System.out.println("Vida de " + oponente.getNome() + ": " + oponente.getVida());
    }




    //Fases do jogador:
    public void faseCompra(){
        System.out.println("Fase de Compra de " + nome);
        hand.comprarCarta(deck);
        hand.mostrarHand();
    }

    public void faseMana (int turno){
        System.out.println("Fase de Mana de " + nome);
        if (this.mana <= 10){
            this.mana = turno;
        } else {
            this.mana = 10;
        }
    }

    public void fasePosicionamento(){
        continuar = true;
        deck.contDeck();
        System.out.println("Fase de Posicionamento de " + nome);
        while (continuar){
            if (mana == 0){
                System.out.println("Sem mana disponível.");
                continuar = false;
            } else {
                System.out.println("A mana disponível é: " + mana);
                System.out.println("Escolha qual carta quer jogar, " + nome);
                int posicao = Integer.parseInt(scanner.nextLine());
                try {
                    jogarCarta(posicao);
                } catch (ManaInsuficienteException e) {
                    System.out.println(e.getMessage());
                    hand.devolverCarta(posicao, cartaRemovida);
                }
                System.out.println("Deseja jogar outra carta, " + nome + "? [S/N]");
                String escolhaCont = scanner.nextLine();
                if (escolhaCont.equalsIgnoreCase("n")) {
                    continuar = false;
                }
            }
        }

        tabuleiro.mostrarTabuleiro();
    }

    public void faseCombate (){
        System.out.println("Fase de Combate de " + nome);
        boolean continuar = true;
        System.out.println("Deseja atacar o adversário, " + nome + "? [S/N]");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("n")){
            continuar = false;
        }
        ArrayList<Integer> cartasUsadas = new ArrayList<>();
        while (continuar){
            CartaCriatura cartaAtaque = null;
            System.out.println("Escolha a carta que atacará: ");
            int escolha1 = Integer.parseInt(scanner.nextLine());
            if (cartasUsadas.contains(escolha1)){
                System.out.println("Essa carta já foi utilizada.");
            } else {
                cartasUsadas.add(escolha1);
                Carta carta1 = tabuleiro.escolherCarta(escolha1);
                if (!(carta1 instanceof CartaCriatura)) {
                    System.out.println("A carta selecionada não é um jogador.");
                } else {
                    cartaAtaque = (CartaCriatura) carta1;
                    boolean verificador = oponente.getTabuleiro().getSlotsTabuleiro().stream().anyMatch (carta -> carta instanceof CartaCriatura);
                    if (verificador) {
                        System.out.println("Agora, escolha qual carta do oponente você deseja atacar: ");
                        CartaCriatura cartaDefesa = null;
                        int escolha2 = Integer.parseInt(scanner.nextLine());
                        Carta carta2 = oponente.getTabuleiro().escolherCarta(escolha2);
                        if (carta2 instanceof CartaCriatura) {
                            cartaDefesa = (CartaCriatura) carta2;
                        }
                        //assert cartaDefesa != null;
                        atacarCarta(cartaAtaque, cartaDefesa, oponente);
                    } else {
                        ataqueDireto(cartaAtaque, oponente);
                    }
                }
            }
            System.out.println("Deseja atacar novamente? [S/N]");
            String decisao = scanner.nextLine();
            if (decisao.equalsIgnoreCase("n")){
                continuar = false;
            }
        }
        oponente.getCemiterio().mostrarCemiterio();
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

    public void setNome(String nome){
        this.nome = nome;
    }
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

    public void setOponente(Jogador oponente){
        this.oponente = oponente;
    }

    public Jogador getOponente(){
        return oponente;
    }

    public Tabuleiro getTabuleiro(){
        return tabuleiro;
    }

    public void status(){
        System.out.println("Vida atual: " + vida);
        System.out.println("Mana atual: " + mana);
    }

    public boolean getVivo(){
        isVivo();
        return vivo;
    }
}