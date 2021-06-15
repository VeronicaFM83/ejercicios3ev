package unidad8_colecciones;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Agenda {
	
	private Map<Integer, String> mapa;
	
	public Agenda() {
		mapa = new TreeMap<Integer, String>();
	}
	
	public Agenda(String nombre, Integer telefono) {
		this();
		mapa.put(telefono, nombre);
	}
	
	public Map<Integer, String> getAgenda() {
		return mapa;
	}

	public void setContacto(String nombre, Integer telefono) {
		mapa.put(telefono, nombre);
	}
	
	public void imprime() {
		mapa.forEach((telefono, nombre) -> System.out.printf("Nombre: " + nombre + " - Tlf: " + telefono + "\n"));
	}
	
	public void buscar(String contacto) {
		boolean encuentra = false;
		int cuenta = 0;
		System.out.println("Contacto buscado: " + contacto);
		for (Entry<Integer, String> e: mapa.entrySet()) {
			if (e.getValue().equals(contacto)) {
				System.out.printf("Tlf: %d \n", e.getKey());
				encuentra = true;
				cuenta++;
			}
		}
		if (encuentra) {
			System.out.println("Se encontraron " + cuenta + " registros");
		} else {
			System.out.println("Contacto no existe");
		}		
	}
	
	public String eliminar(String contacto) {
		boolean resultado = false;
		int cuenta = 0;
		Iterator<Entry<Integer, String>> i = mapa.entrySet().iterator();
		while (i.hasNext()) {
		    Map.Entry item = (Map.Entry) i.next();
		    if(item.getValue().equals(contacto)){
		        i.remove();
		        cuenta++;
		    }
		}
		return "Se han borrado " + cuenta + " registros";	
	}
}
