package com.jogonba.cartas;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.jogonba.cartas.screens.JogoTela;
import com.jogonba.cartas.screens.MainMenuTela;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class JogoCarta extends Game {

    public static final int LARGURA = 1412;
    public static final int ALTURA = 754;

    public SpriteBatch batch;


    @Override
    public void create() {
        batch = new SpriteBatch();
        this.setScreen(new MainMenuTela(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {

    }
}
