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
        jogador1.puxarHandInicial();
        jogador2.puxarHandInicial();
        if (IDJogadorAtivo == 1){

        }
    }
    public void encerrarTurno(){}

    public boolean verificadorTurno(){
        if (jogador1.getVivo() == true && jogador2.getVivo() == true && jogador1.semCartas() == false && jogador2.semCartas() == false){
            return true;
        } else {
            return false;
        }
    }

    public void turno(){
        while (verificadorTurno()){
            iniciarTurno();
            //restante dos comandos
        }
    }
}
