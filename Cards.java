

public class Cards {

	//Definindo os atributos da classe.
	private String nomeCarta;
	private int custoMana;
	
	//Criando e inicializando o construtor.
	public Cards(String nomeCarta, int custoMana) {
		this.nomeCarta = nomeCarta;
		this.custoMana = custoMana;
	}
	
	public String toString() {
		return "Nome: " + nomeCarta + ", Custo de Mana: " + custoMana;
	}
}
