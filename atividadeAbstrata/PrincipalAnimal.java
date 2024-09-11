package atividadeAbstrata;

public class PrincipalAnimal {
	
	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Jota", "Macho", "Pidão");
		Leao leao = new Leao("Scar", "Macho", "Atlas");
		Tigre tigre = new Tigre("Tigrão", "Macho", "Siberiano");
		Cachorro cachorro = new Cachorro("Coragem", "Macho", "Rosa");
		Gato gato = new Gato("Floppette", "Fêmea", "Caracal");
		
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println("--------------------");
		
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("--------------------");
		
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("--------------------");
		
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("--------------------");
		
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
	
	}
	
	
	
	
	
	

}
