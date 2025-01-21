package ut4_4_7_Maquinaria;


import ut4_4_7_Personal.Maquinista;


public class Tren {
	private Locomotora locomotora;
	private Vagon [] vagones;
	private Maquinista maquinista;
	


	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;	
		this.vagones = new Vagon [5];
	}
	
	
	

}
