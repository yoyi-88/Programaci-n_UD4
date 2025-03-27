package ejercicio12;

public class Perro extends Animal {
	
	public void jugar () {
		System.out.println("juega");
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Guau guau");
	}
	
	@Override
	public String moverse() {
		return "Corre feliz";
	}
}
