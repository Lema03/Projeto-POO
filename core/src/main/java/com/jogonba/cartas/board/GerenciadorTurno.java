package com.jogonba.cartas.board;
import com.jogonba.cartas.players.*;
import java.util.Random;
import java.util.Scanner;

public class GerenciadorTurno {
    private Jogador jogador1;
    private Jogador jogador2;
    private int IDJogadorAtivo;
    private Random random;
    private int turno;
    Scanner scanner = new Scanner(System.in);
    private DeckLibrary dl;
    private Deck deckCB;
    private Deck deckMH;

    public GerenciadorTurno(){
        this.jogador1 = new Jogador(1);
        this.jogador2 = new Jogador(2);
        this.dl = new DeckLibrary();
        this.random = new Random();
        this.deckCB = new Deck();
        this.deckMH = new Deck();
    }

    //Métodos relevantes:

    public void inicio(){
        System.out.println("Bem vindos ao jogo:");
        System.out.println("Começaremos com os nomes.");
        System.out.println("DIGITEM SEUS NOMES");
        String nome1 = scanner.nextLine();
        jogador1.setNome(nome1);
        String nome2 = scanner.nextLine();
        jogador2.setNome(nome2);
    }

    public void sorteio(){
        System.out.println("Agora é hora do sorteio");
        System.out.println("Se o número for 0, " + jogador1.getNome() + " começa jogando!");
        int numero = random.nextInt(2);
        System.out.println("O número foi: " + numero);
        if (numero == 0){
            IDJogadorAtivo = 1;
            System.out.println(jogador1.getNome() + " começa jogando!");
        } else {
            IDJogadorAtivo = 2;
            System.out.println(jogador2.getNome() + " começa jogando!");
        }
    }

    public void escolhaDeckCB() {
        deckCB.setCartasDeck(dl.getDeck1().getCartasDeck());
        jogador1.setDeck(deckCB);
        deckMH.setCartasDeck(dl.getDeck2().getCartasDeck());
        jogador2.setDeck(deckMH);
    }

    public void escolhaDeckMH() {
        deckMH.setCartasDeck(dl.getDeck2().getCartasDeck());
        jogador1.setDeck(deckMH);
        deckCB.setCartasDeck(dl.getDeck1().getCartasDeck());
        jogador2.setDeck(deckCB);
    }

    public void alternarJogador(){
        if (IDJogadorAtivo == 1){
            IDJogadorAtivo = 2;
        } else {
            IDJogadorAtivo = 1;
        }
    }

    public void rodadaInicial(){
        dl.embaralharCartas1();
        dl.embaralharCartas2();
        jogador1.status();
        jogador2.status();
        jogador1.getTabuleiro().preencherTabuleiro();
        jogador2.getTabuleiro().preencherTabuleiro();
        System.out.println("Agora, vamos receber as cartas!");
        System.out.println("Primeiro, as cartas de " + jogador1.getNome());
        jogador1.puxarHandInicial();
        jogador1.mostrarHand();
        System.out.println("Agora, as cartas de " + jogador2.getNome());
        jogador2.puxarHandInicial();
        jogador2.mostrarHand();
        if (IDJogadorAtivo == 1){
            jogador1.faseCompra();
            jogador1.faseMana(turno);
            jogador1.fasePosicionamento();
            jogador2.faseCompra();
            jogador2.faseMana(turno);
            jogador2.fasePosicionamento();
            System.out.println("Fim do Turno");
            //alternarJogador();
            turno++;
        } else {
            jogador2.faseCompra();
            jogador2.faseMana(turno);
            jogador2.fasePosicionamento();
            jogador1.faseCompra();
            jogador1.faseMana(turno);
            jogador1.fasePosicionamento();
            System.out.println("Fim do Turno");
            //alternarJogador();
            turno++;
        }
    }

    public void fasesJ1 (){
        jogador1.faseCompra();
        jogador1.faseMana(turno);
        jogador1.fasePosicionamento();
        jogador1.faseCombate();
    }

    public void fasesJ2(){
        jogador2.faseCompra();
        jogador2.faseMana(turno);
        jogador2.fasePosicionamento();
        jogador2.faseCombate();
    }


    public void turno(){
        jogador1.setOponente(jogador2);
        jogador2.setOponente(jogador1);
        if (IDJogadorAtivo == 1){
            fasesJ1();
            fasesJ2();
            System.out.println("Fim do Turno");
            //alternarJogador();
        } else {
            fasesJ2();
            fasesJ1();
            System.out.println("Fim do Turno");
            //alternarJogador();
        }
    }

    public boolean verificadorTurno(){
        if (jogador1.getVivo() == true && jogador2.getVivo() == true && jogador1.semCartas() == false && jogador2.semCartas() == false){
            return true;
        } else {
            return false;
        }
    }

    public void gameplay(){
        inicio();
        sorteio();
        escolhaDeck();
        rodadaInicial();
        System.out.println("Fim da rodada inicial. ");
        while (verificadorTurno()){
            turno();
            turno++;
        }
    }
}
