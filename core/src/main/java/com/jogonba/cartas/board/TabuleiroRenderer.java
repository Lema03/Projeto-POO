package com.jogonba.cartas.board;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;  // Para desenhar texturas
import com.badlogic.gdx.graphics.g2d.BitmapFont;   // Para desenhar texto
import com.badlogic.gdx.graphics.Texture;         // Para imagens
import com.badlogic.gdx.Gdx;                      // Para acessar recursos
import com.badlogic.gdx.graphics.GL20;            // Para limpar a tela
import com.badlogic.gdx.utils.Disposable;  // Para liberar recursos após uso
import com.jogonba.cartas.cards.Carta;


public class TabuleiroRenderer {
    private SpriteBatch spriteBatch;
    private Tabuleiro tabuleiro; // Modelo do tabuleiro
    private BitmapFont font;

    public TabuleiroRenderer(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.spriteBatch = new SpriteBatch();
        this.font = new BitmapFont(); // Fonte para texto, como mana ou ataques
    }

    public void render() {
        spriteBatch.begin();

    }

    public void desenharCartas(){
        for (Carta carta : tabuleiro.getslotsTabuleiro()){

        }
    }
}
