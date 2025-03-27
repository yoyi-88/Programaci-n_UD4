package ejercicio16;

public class Pajaro extends Animal implements Volador{
	@Override
	public void hacerSonido () {
		System.out.println("Pío pío");
	}
	@Override
	public String moverse () {
		return "Vuela";
	}
	
	@Override
	public void volar () {
		System.out.println("Está volando");
	}
	
	
}
