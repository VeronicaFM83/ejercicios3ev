package unidad8_ordenacion;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Pruebas {

	public static void main(String[] args) {
		// PROBANDO COLECCIONES
		System.out.println("HASHSET");
		Set<Libro> libros = new HashSet<>(); 
		libros.add(new Libro("Thinking in Java", "Bruce Eckel")); 
		libros.add(new Libro("Java - The Complete Reference", "Herbert Schildt")); 
		libros.add(new Libro("Thinking in Java", "Bruce Eckel")); 
		System.out.println(libros);
		
		System.out.println("TREESET");
		Set<Libro> masLibros = new TreeSet<>();
		masLibros.add(new Libro("Efective Java", "Joshua Bloch"));
		masLibros.add(new Libro("Java - The Complete Reference", "Herbert Schildt"));
		masLibros.add(new Libro("Thinking in Java", "Bruce Eckel"));
		masLibros.add(new Libro("Efective Java", "Joshua Bloch"));
		masLibros.add(new Libro("On Java 8", "Bruce Eckel"));
		for (Libro libro: masLibros) 
			System.out.println(libro);
		
		Libro [] arLibros = {
				new Libro("Java 8", "Thierry Groussard"), 
				new Libro("Thinking in Java", "Bruce Eckel"), 
				new Libro("Efective Java", "Joshua Bloch"), 
				new Libro("Java 8", "Herbert Schildt")
		};
		
		System.out.println("ARRAY - ORDEN NATURAL (AUTOR, TITULO)");
		Arrays.sort(arLibros); 
		for (Libro libro: arLibros) 
			System.out.println(libro);
		System.out.println("ARRAY - ORDEN TITULO, AUTOR");
		Arrays.sort(arLibros, new Comparador()); 
		for (Libro libro: arLibros) 
			System.out.println(libro);
		
		System.out.println("PROBANDO COLAS DE PRIORIDAD: ORDEN NATURAL");
		PriorityQueue<Libro> cola = new PriorityQueue<Libro>();
//		Collection<Libro> coleccion = new LinkedList<Libro>();
//		coleccion = Arrays.asList(arLibros);
//		cola.addAll(coleccion);
		cola.addAll(Arrays.asList(arLibros));
		Iterator<Libro> i = cola.iterator();
		System.out.println("ORDEN NATURAL");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("ORDEN COMPARADOR");
		PriorityQueue<Libro> cola2 = new PriorityQueue<Libro>(new Comparador());
		cola2.addAll(cola);
		Iterator<Libro> i2 = cola2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		
	}

}
