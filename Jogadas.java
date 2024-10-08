

//Equivalentes aos feitiços

public class Jogadas extends Cards{

	private String efeito;
	
	public Jogadas(String nomeCarta, int custoMana, String efeito) {
		super (nomeCarta, custoMana);
		this.efeito = efeito;
	}
	
	public String toString() {
		return super.toString() + ", Efeito: " + efeito;
	}
	public void efeito(Jogadores JogadorAlvo) {
		if ("Provocação".equals(getnomeCarta())) {
			JogadorAlvo.mudarDefesa(-4);
		}
		//O restante dos efeitos vem aqui
		
	}
}
