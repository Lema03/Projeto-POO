

//Equivalentes aos encantamentos

public class Taticas extends Cards{

	private String efeito;
	
	public Taticas (String nomeCarta, int custoMana, String efeito) {
		super (nomeCarta, custoMana);
		this.efeito = efeito;
	}
	
	public String toString() {
		return super.toString() + ", Efeito: " + efeito;
	}
}
