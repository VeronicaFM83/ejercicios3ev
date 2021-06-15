package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio6b {
	
//	INCOMPLETO !!
	
	static Map<Integer, String> mapa = new TreeMap<Integer, String>();

	public static void main(String[] args) throws IOException {
		

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("> ");
			ejecutar(bf.readLine());
		} while (!bf.readLine().equalsIgnoreCase("salir"));
		
	}
	
	
	public static void ejecutar(String cadena) {
		
		String [] palabras = cadena.split(":");
		try {
			switch (palabras[0].trim()) {
				case "buscar":
				break;
				case "eliminar":
				break;
				case "contactos":
				break;
				default:
					creaContacto(palabras[0].trim(), Integer.parseInt(palabras[1].trim()));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static void creaContacto(String nombre, Integer telefono) {
		mapa.put(telefono, nombre);
		
	}

}
