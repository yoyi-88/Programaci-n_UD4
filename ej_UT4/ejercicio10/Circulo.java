package ejercicio10;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio (double radio) {
		this.radio = radio;
	}
	
	
	void calcularArea () {
		final double PI = 3.141592;
		double area = PI * (radio*radio);
		System.out.println(area);
	}
	
}
