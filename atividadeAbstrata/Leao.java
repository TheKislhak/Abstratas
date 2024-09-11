package atividadeAbstrata;

public class Leao extends Animal {
	
	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O leãoo dorme");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O leão caminha");
	}
	
	@Override
	public void correr() {
		System.out.println("O leão corre");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O leão ruge");
	}

}