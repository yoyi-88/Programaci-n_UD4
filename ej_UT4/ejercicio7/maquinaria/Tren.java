package ejercicio7.maquinaria;

import ejercicio7.personal.Maquinista;

public class Tren {
	Locomotora locomotora;
	Vagon nuevoVagon [];
	Maquinista maquinista;
	private int numVagones;
	
	public Tren(Locomotora locomotora, Maquinista maquinista, int numVagones) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		numVagones = 0; 
		nuevoVagon = new Vagon [5];
	}
	
	public void engancharVagon (int cargaMax, int cargaActual, String tipoMercancia) {
		if (numVagones >= 5)
			System.out.println("No se permiten más de 5 vagones");
		else {
			Vagon vagon = new Vagon (numVagones, cargaMax, cargaActual, tipoMercancia);
			nuevoVagon [numVagones] = vagon;
			numVagones++;
		}
	}
	
	public void desengancharVagon (int cargaMax, int cargaActual, String tipoMercancia) {
		if (numVagones==0)
			System.out.println("No queda ningún vagón");
		else {
			Vagon vagon = new Vagon (numVagones, cargaMax, cargaActual, tipoMercancia);
			nuevoVagon [numVagones] = vagon;
			numVagones--;
		}
	}
}
	
	

