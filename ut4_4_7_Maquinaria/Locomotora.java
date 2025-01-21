package ut4_4_7_Maquinaria;

import ut4_4_7_Personal.Mecanico;

public class Locomotora {
	String matricula;
	int potencia;
	String antiguedad;
	private Mecanico mecanico;
	
	public Locomotora(String matricula, int potencia, String antiguedad, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.mecanico = mecanico;
	}

}
