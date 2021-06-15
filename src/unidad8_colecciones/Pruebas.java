package unidad8_colecciones;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		Random r = new Random();
		List<Integer> lista = new LinkedList<>();
		for (int i=0; i<10; i++)
			lista.add(r.nextInt(9) + 1);
		Iterator<Integer> i = lista.iterator();
		while (i.hasNext())
			System.out.print(i.next() + "  ");
		System.out.println();
		
		Set<Integer> set1 = new HashSet<>(lista);
		for (Integer n: set1)
			System.out.print(n + "  ");
		System.err.println();
		
		
		Set<Integer> set2 = new TreeSet<>(lista);
		set2.forEach(n -> System.out.print(n + "  "));
		System.err.println();
		
		
		Collection<String> c;		
		c = new ArrayList<String>(); 
		c.add("Carmen"); c.add("Fernando"); 
		System.out.println("La lista contiene a Roberto: " + c.contains("Roberto")); 
		c.remove("Fernando"); 
		System.out.println("Número de nombres en la lista: " + c.size()); 
		c.clear(); 
		c = new HashSet<String>(); 
		c.add("Elisa"); 
		c.add("Roberto"); 
		System.out.println("El conjunto contiene a Roberto: " + c.contains("Roberto")); 
		c.remove("Roberto"); 
		System.out.println("Numero de nombres en el conjunto: " + c.size()); 
		c.clear();
		
		Collection<String> l = new ArrayList<String>(); 
		l.add("Carmen"); 
		l.add("Fernando"); 
		System.out.println(((List<String>) c).get(1));
		*/
		/*
		List<String> c = new ArrayList<String>(); 
		c.add("Carmen"); c.add("Fernando"); 
		System.out.println(c.get(1));
		*/
		
		/*
		Map<Integer, String> m = new TreeMap<Integer, String>(); m.put(11111111, "Elena Fernández"); m.put(11222333, "Carlos González"); m.put(11444555, "Rodrigo Rodíguez");
		m.put(11321123, "Elena Fernández"); m.put(11777999, "Pilar Ramos");
		
		// Mostrar mapa con iterador
		Iterator<Entry<Integer, String>> i = m.entrySet().iterator(); 
		while (i.hasNext()) { 
			Entry<Integer, String> e = i.next(); 
			System.out.printf("NIF: %d - Nombre: %s\n", e.getKey(), e.getValue()); 
		}
		
		// mostrar mapa con bucle for mejorado
		for (Entry<Integer, String> e: m.entrySet()) 
			System.out.printf("NIF: %d - Nombre: %s\n", e.getKey(), e.getValue());
		
		m.forEach((nif, nombre) -> System.out.printf("NIF: %d - Nombre: %s\n", nif, nombre));
		*/
	}

}
