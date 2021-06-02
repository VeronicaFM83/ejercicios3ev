package unidad8_colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Contacto {
	private Map<String, Integer> mapa;
	
	public Contacto() {
		mapa = new TreeMap<>();
	}
	
	public Contacto(String nombre, int telefono) {
		this();
		//List<Integer> lista = new ArrayList<Integer>();
		//lista.add(telefono);
		mapa.put(nombre, telefono);
	}
	
	public void addTLF(String nombre, int telefono) {
		mapa.put(nombre, telefono);
	}
	
	public void imprime() {
		mapa.forEach((nombre, telefono) -> System.out.printf("Nombre: " + nombre + " - Tlf: " + telefono + "\n"));
	}
	
	
	// NO SALE EL SEGUNDO NUMERO DE PEPITO !!

	
	public static void main(String[] args) {
		Contacto agenda = new Contacto();
		agenda.addTLF("pepito", 123);
		agenda.addTLF("pepito", 456);
		agenda.addTLF("ana", 123);
		agenda.addTLF("manu", 987);
		agenda.imprime();

	}


	
}
