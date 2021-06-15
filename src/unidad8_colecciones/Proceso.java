package unidad8_colecciones;

public class Proceso {

	private String nombre;
	private int id;
	
	public Proceso(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}
	
	public void ejecutar() {
		System.out.println("Ejecutando " + this.nombre);
	}
	
	
}
