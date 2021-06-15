package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		
		Agenda agenda = new Agenda();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("> ");
		String linea = br.readLine().toLowerCase().trim();
		String [] palabras = linea.split(":");
		while (!palabras[0].trim().equals("fin")) {
			try {
				switch (palabras[0].trim()) {
					case "buscar":
						agenda.buscar(palabras[1].trim());
						break;
					case "eliminar":
						System.out.println(agenda.eliminar(palabras[1].trim()));
						break;
					case "contactos":
						agenda.imprime();
						break;
					default:
						agenda.setContacto(palabras[0].trim(), Integer.parseInt(palabras[1].trim()));
						break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("> ");
			palabras = br.readLine().toLowerCase().split(":");
		}
		
		
		
//		
//		// añadir
//		agenda.setContacto("pepe", 11111);
//		agenda.setContacto("pepito", 123);
//		agenda.setContacto("pepito", 456);
//		agenda.setContacto("ana", 125);
//		agenda.setContacto("manu", 987);
//
//		
//		
//		// buscar
//		agenda.buscar("pepito");
//		agenda.buscar("paco");
//		
//		// eliminar
//		System.out.println(agenda.eliminar("pepito"));
//		
//		// mostrar todos
//		agenda.imprime();
//		

		
	}

}
