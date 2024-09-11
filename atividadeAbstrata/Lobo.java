package atividadeAbstrata;

public class Lobo extends Animal {
	
	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O lobo dorme");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O labo caminha");
	}
	
	@Override
	public void correr() {
		System.out.println("O lobo corre");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O lobo uiva");
	}

}
