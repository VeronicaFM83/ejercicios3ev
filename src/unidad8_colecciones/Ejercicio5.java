package unidad8_colecciones;

import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {

		System.out.println(">");
		Queue<Integer> cola = new LinkedList<Integer>();
		
		// Primera l?nea
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int x = s.nextInt();
		System.out.println(">");
		for (int i=0; i<n; i++){
			cola.add(s.nextInt());
		}
		System.out.println(cola);
		
		// Segunda l?nea
		for (int i=0; i<k; i++){
			cola.poll();
		}
		System.out.println(cola);

		// Resultado
		if (cola.isEmpty()) {
			System.out.println("Cola vac?a");
		} else {
			System.out.println("Tama?o cola: " + cola.size());
			// Comprueba n?mero
			if (cola.contains(x)) {
				System.out.println("Se encuentra (TRUE): " + x);
			} else {
				PriorityQueue<Integer> colaOrden = new PriorityQueue<Integer>(cola);
				System.out.println("N?mero menor: " + colaOrden.peek());
			}
		}
		System.out.println("FIN");
		s.close();
	}
}
