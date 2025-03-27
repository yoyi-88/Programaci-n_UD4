package ejercicio4;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;

	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Hora() {
		horas = 00;
		minutos = 00;
		segundos = 00;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getHoras() {
		return horas;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getSegundos () {
		return segundos;
	}

	public void incrementarSegundos () {
		segundos++;
		if (segundos>59) {
			segundos=0;
			minutos++;
		}
		if (minutos>59) {
			minutos=0;
			horas++;
		}
		if (horas>23)
			horas=0;
		
	}
	public String Imprimir() {
		return String.format("%02d:%02d:%02d", horas, minutos, segundos);
				
	}
	
}
