package ejercicio10;

public class Ejercicio10Main {
	public static void main(String[] args) {
		Figura [] figuras1 = new Figura [2];
		
		Circulo circulo = new Circulo ("Circulo", 5);
		Rectangulo rectangulo = new Rectangulo ("Rectangulo", 2, 5);
		
		figuras1 [0] = circulo;
		figuras1 [1] = rectangulo; 
		
		for(int i=0; i<=figuras1.length;i++) {
			
			figuras1[i].mostrarInformacion();
			figuras1[i].calcularArea();
			
		}
	}
}
