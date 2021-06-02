package unidad8_colecciones;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Collection<String> lista = new LinkedHashSet<>(); // Los elementos se encuentran en el orden que se insertan, sin valores repetidos
		int n = in.nextInt(); // Número de elementos a insertar
		for (int i=0; i<n; i++) {
			String nombre = in.next(); // Almacenamos texto por teclado
			if (!lista.contains(nombre)) // Comprueba si la lista NO contiene el texto (no hace falta si se usa LinkedHashSet<>)
				lista.add(nombre); // Lo agregamos
		}
		System.out.println(lista); // Se imprime lista
		in.close();
	}

}
