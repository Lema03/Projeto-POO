package com.jogonba.cartas.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.jogonba.cartas.JogoCarta;

public class JogoTela implements Screen {
    private Texture image;
    private JogoCarta jogo;

    public JogoTela(JogoCarta jogo){
        this.jogo = jogo;
    }

    @Override
    public void show() {
        image = new Texture("tabuleirotexture.png");
    }

    @Override
    public void render(float v) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        jogo.batch.begin();
        jogo.batch.draw(image, 0, 0);
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
        image.dispose();
    }
}
