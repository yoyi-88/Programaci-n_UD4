package ejercicio12;

public class Pajaro extends Animal{
	@Override
	public void hacerSonido () {
		System.out.println("Pío pío");
	}
	@Override
	public String moverse () {
		return "Está volando";
	}
}
