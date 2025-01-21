package ut4_4_7_Personal;

import java.time.LocalDateTime;

public class JefeEstacion {
	private String nombre;
	private String dni;
	private LocalDateTime fecha_nombramiento;
	
	public JefeEstacion(String nombre, String dni, LocalDateTime fecha_nombramiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_nombramiento = fecha_nombramiento;
	}
}
