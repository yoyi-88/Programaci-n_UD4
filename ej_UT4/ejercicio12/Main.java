package ejercicio12;

public class Main {
	public static void main(String[] args) {
		
		Animal [] animales = {new Perro(), new Gato(), new Pajaro()};
		
		for (int i=0; i<animales.length; i++) {
			animales[i].mostrarInformacion();
		}
		
	}
}
