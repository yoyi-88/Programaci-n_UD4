package ej_1_2_3;

public class Fiesta {

	public static void main(String[] args) {

		Persona yoyi = new Persona("yoyi", 33, 1.72);

		
		System.out.println(yoyi);


		Persona ale = new Persona();
		Persona leo = new Persona();

		Persona lean = new Persona("Lean", 23, 1.89);
		Persona paco = new Persona("Paco", 13, 1.60);

		Persona lola = new Persona("Lola");

		Persona pepe = new Persona("Pepe", "Rubiales", 25, 1.80);
		

		System.out.println(pepe.getNombre());
		pepe.setNombre("mark");
		System.out.println(pepe.getNombre());
		pepe.setEdad(0);
		pepe.setEstatura(0);

	}

}
