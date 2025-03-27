package ejercicio16;

public class Perro extends Animal implements Corredor {
	@Override
	public void hacerSonido() {
		System.out.println("Guau guau");
	}
	
	@Override
	public String moverse() {
		return "Corre";
	}
	
	@Override
	public void correr() {
		System.out.println("Está corriendo");
	}
}
