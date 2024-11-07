package com.jogonba.cartas.board;
import com.jogonba.cartas.players.Jogador;
import java.util.Random;

public class GerenciadorTurno {
    private Jogador jogador1;
    private Jogador jogador2;
    private int IDJogadorAtivo;
    private Random random;

    public GerenciadorTurno(Jogador jogador1, Jogador jogador2, Random random){
        this.jogador1 = new Jogador(1);
        this.jogador2 = new Jogador(2);
        this.random = new Random();
    }

    //Métodos relevantes:
    public void sorteio(){
        int numero = random.nextInt(1);
        if (numero == 0){
            IDJogadorAtivo = 1;
        } else {
            IDJogadorAtivo = 2;
        }
    }

    public void alternarJogador(){
        if (IDJogadorAtivo == 1){
            IDJogadorAtivo = 2;
        } else {
            IDJogadorAtivo = 1;
        }
    }

    public void iniciarTurno(){

        if (IDJogadorAtivo == 1){

        }
    }
    public void encerrarTurno(){}


}
