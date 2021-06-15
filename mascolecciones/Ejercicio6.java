package unidad8.mascolecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio6 {
	
	/*
	 * Método llamado moda que acepte una lista de números enteros como parámetro y retorne el número que 
	 * se repite con mayor frecuencia (la moda). Retornar 0 si la lista está vacía.
	 */

	public static void main(String[] args) throws IOException {
		
		List<Integer> lista = new LinkedList<Integer>();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(in.readLine());
		
		while (s.hasNextInt()) {
			lista.add(s.nextInt());
		}
		System.out.println(moda(lista));
		
	}
	
	public static Integer moda(List<Integer> lista) {
		int resultado = 0;
		if (!lista.isEmpty()){
			Map<Integer,Integer> mapa = new HashMap<Integer, Integer>();
			
			for (Integer num : lista) {
				if (mapa.containsKey(num)) {
					mapa.put(num, mapa.get(num)+1);
				} else {
					mapa.put(num,1);
				}
//				System.out.println(mapa);
			}
			
			int valor = 0;
			for (Entry<Integer, Integer> e: mapa.entrySet()) {
				if (e.getValue()> valor) {
					valor = e.getValue();
					resultado = e.getKey();
				}
			}
		}
		return resultado;
	}

}
