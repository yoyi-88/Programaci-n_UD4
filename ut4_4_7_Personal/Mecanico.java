package ut4_4_7_Personal;

public class Mecanico {
	private String nombre;
	private int telefono;
	private Especialidad especialidad;
	
	public Mecanico(String nombre, int telefono, Especialidad especialidad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}

}
enum Especialidad{
	frenos, hidraulica, electricidad, motor
}
