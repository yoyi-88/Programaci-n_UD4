package ejercicio12;

public class Gato extends Animal{
	
	@Override
	public void hacerSonido() {
		System.out.println("Miau miau");
	}
	
	@Override
	public String moverse() {
		return "Se mueve agazapado";
	}
}
