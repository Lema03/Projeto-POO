package com.jogonba.cartas.screens;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.ScreenUtils;
import com.jogonba.cartas.JogoCarta;
import com.jogonba.cartas.players.Jogador;

public class JogoTela implements Screen {

    private Jogador jogador1;
    private Jogador jogador2;
    private BitmapFont font;
    private Texture tabuleiro;
    private JogoCarta jogo;

    public JogoTela(JogoCarta jogo){
        this.jogo = jogo;

        jogador1 = new Jogador(1);
        jogador2 = new Jogador(2);

        tabuleiro = new Texture("tabuleirotexture.png");
        font = new BitmapFont(Gdx.files.internal("fontejogo.fnt"));

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        jogo.batch.begin();
        jogo.batch.draw(tabuleiro, JogoCarta.LARGURA / 2 - tabuleiro.getWidth() / 2, 0);
        font.draw(jogo.batch, "TESTE DE TEXTO", 0, JogoCarta.ALTURA);
        jogo.batch.end();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        jogo.batch.dispose();
        tabuleiro.dispose();
    }


}
