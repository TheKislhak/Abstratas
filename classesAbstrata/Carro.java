package classesAbstrata;

public class Carro extends Veiculos {
	
	public Carro(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println("O carro está acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("O carro está freando");
	}
	
	@Override
	public void virar() {
		System.out.println("O carro esta virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("O carro está ligado");
	}

}
