package unidad8_colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {
	
	static List<Integer> listaNumeros = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		generaNumeros(n);
		/*
		// Usando iterador
		System.out.println("\nUSANDO ITERADOR\n");
		Iterator<Integer> i = listaNumeros.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// Usando for mejorado
		System.out.println("\nUSANDO FOR MEJORADO\n");
		for (int num: listaNumeros) {
			System.out.print(num);
		}*/
		// Usando forEach
		System.out.println("\nUSANDO FOREACH");
		listaNumeros.forEach(num -> System.out.print(num + " "));
		
		// Solo registros únicos
		Set<Integer> unicos = new LinkedHashSet<>(listaNumeros);
		System.out.println("\nLinkedHashSet");
		unicos.forEach(num -> System.out.print(num + " "));
		
		System.out.println("\nHashSet");
		Set<Integer> set1 = new HashSet<>(listaNumeros);
		for (Integer a: set1)
			System.out.print(a + " ");
		System.err.println();
		
		System.out.println("\nTreeSet");
		Set<Integer> set2 = new TreeSet<>(listaNumeros);
		set2.forEach(a -> System.out.print(a + " "));
		System.err.println();
		
		in.close();
	}
	
	static void generaNumeros(int n) {
		for (int i=0; i<n; i++) {
			Random r = new Random();
			int aleatorio = r.nextInt(9)+1;// Random entre 0 y 99 + 1 (de 1 a 100).
			listaNumeros.add(aleatorio);
		}
		System.out.println("Generada lista");
	}
}
