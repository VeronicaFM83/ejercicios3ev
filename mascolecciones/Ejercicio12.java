package unidad8.mascolecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio12 {
//
//	Método llamado duplicar que acepte una pila de números enteros como parámetro y sustituya cada
//	valor almacenado por el mismo duplicado, manteniendo el orden original.
//	Por ejemplo, dada la pila:
//	Tope  [5, 9, 2, 6, 7]
//	Almacenará en ella los valores:
//	Tope  [5, 5, 9, 9, 2, 2, 6, 6, 7, 7]
	
	public static void main(String[] args) {
		Deque<Integer> pila = new LinkedList<Integer>();
		Scanner s = new Scanner("7 6 2 9 5");
		while (s.hasNextInt()) {
			pila.push(s.nextInt());
		}
		System.out.println(duplicar(pila));

	}
	
	public static Deque duplicar(Deque<Integer> pila) {
		Queue<Integer> cola = new LinkedList<Integer>();
		//System.out.println("PILA " + pila);
		while (!pila.isEmpty()) {
			cola.offer(pila.peek());
			cola.offer(pila.pop());
		}
		pila.addAll(cola);
		return pila;
	}

}
