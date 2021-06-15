package unidad8_colecciones;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Robot {
	
	// atributos
	
	
	private String nombre;
	private Integer segundos;
	
	// constructor
	
	public Robot(String nombre, Integer segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}
	
	// getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ", Tiempo proceso: " + this.segundos + " seg";
	}
	
	// métodos
	
	public String procesado(String producto, LocalTime hora) {
		LocalTime horaFin = hora.plusSeconds(this.segundos);
		return this.nombre + " - " + producto + " [" + horaFin + "]";
	}

}
