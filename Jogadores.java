package poo;

public class Jogadores extends Cards{

	private int ataque;
	private int defesa;
	
	public Jogadores(String nomeCarta, int custoMana, int ataque, int defesa, String passiva) {
		super (nomeCarta, custoMana);
		this.ataque = ataque;
		this.defesa = defesa;
	}
	public String toString() {
		return super.toString() + ", Ataque: " + ataque + ", Defesa: " + defesa;
	}
}
