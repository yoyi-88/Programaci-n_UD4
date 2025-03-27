package ejercicio11;

public class Main {
	public static void main(String[] args) {
		Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "87654321B", 1967);
		Libro libro2 = new Libro("El Código Da Vinci", "Dan Brown", "56789012C", 2003);
		Libro libro3 = new Libro("Dune", "Frank Herbert", "23456789D", 1965);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
		
		System.out.println(libro1.equals(libro2));
		
		System.out.println(libro1.equals(libro3));
		
	}
}
