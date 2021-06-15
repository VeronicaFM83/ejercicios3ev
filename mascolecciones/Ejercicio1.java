package unidad8.mascolecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String [] array = bf.readLine().split(","); //.split("\\p{L}+")
		List<String> lista = new LinkedList<String>(Arrays.asList(array));
		//System.out.print(lista);
		List<String> lista2 = eliminarLasDeLongitudPar(lista);
		for (String cadena: lista) {
			System.out.print(cadena + " ");
		}

	}

	public static List<String> eliminarLasDeLongitudPar(List<String> cadenas) {
		Iterator<String> i = cadenas.iterator(); 
		while (i.hasNext()) 
			if (i.next().length() % 2 == 0)
				i.remove(); 
		return cadenas;
	}
}
