package classesAbstrata;

public class Principal {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro("00000", "F1", "Vermelho", 2023);
		Carro ford = new Carro("03400", "F1", "Amerelo", 2026);
		
		ferrari.acelerar();
		ferrari.frear();
		ferrari.virar();
		ferrari.ligar();
		
		System.out.println("-------------------");
		
		ford.acelerar();
		ford.frear();
		ford.virar();
		ford.ligar();
		
		System.out.println("-------------------");
		
		Moto honda = new Moto("34783", "F1", "Azul", 2021);
		honda.acelerar();
		honda.frear();
		honda.virar();
		honda.ligar();
		
		System.out.println("-------------------");
		
		Onibus marcopolo = new Onibus("1111", "XB1", "Prata", 2020);
		marcopolo.acelerar();
		marcopolo.frear();
		marcopolo.virar();
		marcopolo.ligar();

	}

}
