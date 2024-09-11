package atividadeAbstrata;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O cachorro dorme");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O cachorro caminha");
	}
	
	@Override
	public void correr() {
		System.out.println("O cachorro corre");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro late");
	}

}