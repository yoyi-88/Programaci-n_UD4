package ejercicio7.personal;

import java.time.LocalDateTime;

public class JefeDeEstacion {
	private String nombre;
	private String dni;
	private LocalDateTime fecha;
	
	//Constructor:
	public JefeDeEstacion(String nombre, String dni, LocalDateTime fechaJefe) {
		this.nombre = nombre;
		this.dni = dni;
		this.fecha = fechaJefe;
	}
	
}
