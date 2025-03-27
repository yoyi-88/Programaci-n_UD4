package ejercicio11;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private int anioPublicacion;
	
	//Constructor:
	public Libro (String titulo, String autor, String isbn, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
	}
	
	@Override
	public String toString () {
		return "Titulo: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion +".";
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		Libro libro = (Libro) obj;
		return isbn.equals(libro.isbn); 
			
		
	}
}
