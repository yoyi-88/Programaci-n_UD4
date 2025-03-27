package ejercicio13;

public final class MatematicasUtil {
	final static double PI = 3.141592;
	
	public static double calcularAreaCirculo(double radio) {
		double area = PI * Math.pow(radio, 2);
		return area;
	}
	
	public static double calcularPerimetroRectangulo (double largo, double ancho) {
		double perimetro = (2 * largo) + (2 * ancho);
		return perimetro;
	}
	
	public static boolean esPrimo (int numero) {
		if (numero <= 1)
			return false;
		else if (numero == 2)
			return true;
		else {
			for (int i=2; i<numero; i++) {
				if (numero % i == 0)
					return false;
			}
			return true;
		}
	}
	

	public static void factorial (int n) {
		int factor = 1;
		for (int i=2; i<=n; i++) {
			factor *= i;
		}
		System.out.println("Factorial de " + n + ": " + factor);
	}
	

	public static void redondearDecimal (double numero, int decimales) {
		double potencia = Math.pow(10, decimales);
		double decimalRedondeado = Math.round(numero * potencia) / potencia;
		System.out.println(decimalRedondeado);
	}
}
