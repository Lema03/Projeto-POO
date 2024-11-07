package com.jogonba.cartas.cards;

public class CartaEncantamento extends Carta {
    private Efeitos efeito;
    private String tipoEfeito;
    private int valor;

    public CartaEncantamento(String nome, int custoMana, Efeitos efeito, String tipoEfeito, int valor) {
        super(nome, custoMana);
        this.efeito = efeito;
        this.tipoEfeito = tipoEfeito;
        this.valor = valor;
    }

    public void ativarEfeito(CartaCriatura cartaCriatura){
        switch (tipoEfeito){
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
}
