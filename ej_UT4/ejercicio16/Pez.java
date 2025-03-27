package ejercicio16;

public class Pez extends Animal implements Nadador{
	@Override
	public void hacerSonido() {
		System.out.println("Glu glu");
	}

	@Override
	public String moverse() {
		return "Flota hacia delante";
	}
	
	@Override
	public void nadar() {
		System.out.println("Está nadando");
	}
}
