package Examen;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Queue<Integer> cola = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
//		int n = 4;
		
		Queue<Integer> cola = new LinkedList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca nº de posiciones a invertir: ");
		int n =in.nextInt();
		System.out.println("Introduzca números de la cola: (pulse cualquier letra para terminar)");
		while (in.hasNextInt()) {
			cola.offer(in.nextInt());
		}
		in.close();
		invertir(n,cola);
		
	}
	
	
	public static void invertir(int n, Queue<Integer> cola) {
		int resto = cola.size() - n;
		System.out.println(cola);
		if (n <= 0) {
			System.out.println(cola);
		} else if (cola == null || cola.size() < n) {
			throw new IllegalArgumentException();
		} else {
			Deque<Integer> aux = new LinkedList<Integer>();
			while (n > 0) {
				aux.push(cola.poll());
				n--;
			}

			while (!aux.isEmpty()) {
				cola.offer(aux.pop());
			}
			
			while (resto > 0) {
				cola.offer(cola.poll());
				System.out.println(cola);
				resto--;
			}
			System.out.println(cola);
		}
	}
}
