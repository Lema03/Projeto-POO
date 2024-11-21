package com.jogonba.cartas.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.ScreenUtils;
import com.jogonba.cartas.JogoCarta;

public class JogoTela implements Screen {

    private BitmapFont font;
    private Texture tabuleiro;
    private JogoCarta jogo;

    public JogoTela(JogoCarta jogo){
        this.jogo = jogo;

        tabuleiro = new Texture("tabuleirotexture.png");
        font = new BitmapFont();
        font.setColor(Color.WHITE);
        font.getData().setScale(2);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        jogo.batch.begin();
        jogo.batch.draw(tabuleiro, JogoCarta.LARGURA / 2 - tabuleiro.getWidth() / 2, 0);
        font.draw(jogo.batch, "Teste", 100, 200);
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
