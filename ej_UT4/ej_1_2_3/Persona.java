package ej_1_2_3;


public class Persona {

	private String nombre;
	private int edad;
	private double estatura;
	
	public enum Sexo {
		HOMBRE, MUJER
	}
	
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	public Persona() {
		nombre = "x";
		edad = 23;
		estatura = 1.50;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, String apellido, int edad, double estatura) {
		this(nombre + " " + apellido);
		this.edad = edad;
		this.estatura = estatura;
	}

	void saludar() {
		System.out.println("Hola " + nombre);
	}

	void cumplirAnyos() {
		edad++;
	}

	void crecer(double incremento) {
		estatura = estatura + incremento;
	}

	void metodo() {
		int edad = 8;
		System.out.println(edad);
		System.out.println(this.edad);
	}
		
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		if (nombre.length()<20)
			this.nombre = nombre;
		else
			System.out.println("nombre demasiado largo");
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setEdad (int edad) {
		if (edad>0)
			this.edad = edad;
		else
			System.out.println("edad debe ser mayor que 0");
	}
	
	public double getEstatura () {
		return estatura;
	}
	
	public void setEstatura (double estatura) {
		if (estatura>0.00)
			this.estatura = estatura;
		else
			System.out.println("estatura debe ser mayor que 0");
	}
	

}