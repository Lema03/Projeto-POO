package com.jogonba.cartas.cards;

import com.badlogic.gdx.graphics.Texture;

public class CartaEncantamento extends Carta {
    private int valor;

    public CartaEncantamento(String nome, int custoMana, String tipoEfeito, int valor, Texture textura) {
        super(nome, custoMana, tipoEfeito, textura);
        this.valor = valor;
    }

    public void ativarEfeito(CartaCriatura cartaCriatura){
        switch (getTipoEfeito()){
            case "aumentarAtaque":
                cartaCriatura.aumentarAtaque(valor);
                break;
            case "diminuirAtaque":
                cartaCriatura.diminuirAtaque(valor);
                break;
            case "aumentarDefesa":
                cartaCriatura.aumentarDefesa(valor);
                break;
            case "diminuirDefesa":
                cartaCriatura.diminuirDefesa(valor);
                break;
            //Outros tipos de encantamento
        }

    }

    //public String toString(){
    //    return super.toString() + ", Efeito: " + efeito;
    //}
}
