package ejercicio16;

public class Pato extends Animal implements Volador, Nadador {
	@Override
	public void hacerSonido () {
		System.out.println("Cuac cuac");
	}
	@Override
	public String moverse () {
		return "Vuela";
	}
	
	@Override
	public void volar () {
		System.out.println("El pato está volando");
	}
	@Override
	public void nadar() {
		System.out.println("El pato está nadando");
	}
}
