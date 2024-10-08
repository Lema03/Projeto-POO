

public class Jogadores extends Cards{

	private int ataque;
	private int defesa;
	private String passiva;
	
	public Jogadores(String nomeCarta, int custoMana, int ataque, int defesa, String passiva) {
		super (nomeCarta, custoMana);
		this.ataque = ataque;
		this.defesa = defesa;
		this.passiva = passiva;
	}
	public String toString() {
		return super.toString() + ", Ataque: " + ataque + ", Defesa: " + defesa + ", Passiva: " + passiva;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque() {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa() {
		this.defesa = defesa;
	}
	
	public void mudarAtaque(int valor) {
		this.ataque += valor;
		if (valor > 0) {
			System.out.println("O ataque de " + getnomeCarta() + " foi aumentado em " + valor + "!");
		}
		if (valor < 0) {
			System.out.println("O ataque de " + getnomeCarta() + " foi reduzido em " + valor + "!");
		}
	}
	public void mudarDefesa(int valor) {
		this.defesa += valor;
		if (valor > 0) {
			System.out.println("A defesa de " + getnomeCarta() + " foi aumentada em " + valor + "!");
		}
		if (valor < 0) {
			System.out.println("A defesa de " + getnomeCarta() + " foi reduzida em " + valor + "!");
		}
	}
	public void efeito() {
		if ("The GOAT".equals(passiva)) {
			this.mudarAtaque(2);
		}
		if ("The King".equals(passiva)) {
			this.mudarAtaque(3);
			this.mudarDefesa(3);
		}
		// Esse é só um esboço da estrutura das passivas. O restante ainda será implementado
	}
}
