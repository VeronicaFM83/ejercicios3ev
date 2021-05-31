package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashMap;

public class Ejercicio322 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, TreeSet<String>> mapa = new HashMap<Integer, TreeSet<String>>();
		System.out.println("Lineas:");
		int n = Integer.valueOf(br.readLine()); //se supone que la primera linea indica nº de lineas
		for (int i=0; i<n; i++) { 
			Scanner s = new Scanner(br.readLine()); // pasa a escaner para usar hasNext
			while (s.hasNext()) // mientras haya más palabras
				agregarPalabra(mapa, s.next()); // pasa como parametro el mapa y la palabra
		} 
		int longitud;
		do {
			System.out.println("Long:");
			longitud = Integer.valueOf(br.readLine());
			if (longitud > 0) 
				System.out.println(mapa.get(longitud)); // devuelve el valor (TreeSet)
		
		} while (longitud > 0);
		System.out.println(mapa);
	}
	
	static void agregarPalabra(Map<Integer, TreeSet<String>> mapa, String palabra) {
		int longitud = palabra.length(); // 
		TreeSet<String> set = mapa.get(longitud); // devuelve el valor (TreeSet)
		if (set == null) {
			set = new TreeSet<String>();
			mapa.put(longitud, set);
		}
		set.add(palabra);
	}

}
