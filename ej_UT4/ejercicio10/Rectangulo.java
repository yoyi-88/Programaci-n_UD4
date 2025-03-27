package ejercicio10;

public class Rectangulo extends Figura {
	private double base;
	private double altura;
	
	public Rectangulo (String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase (double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public void calcularArea() {
		double area = base * altura;
		System.out.println(area);
	}
}
