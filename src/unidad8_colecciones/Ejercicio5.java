package unidad8_colecciones;

import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(">");
		Queue<Integer> cola = new LinkedList<Integer>();
		// Primera línea
		Scanner in = new Scanner(System.in);
		Scanner s = new Scanner(in.nextLine());
		int n = s.nextInt();
		int k = s.nextInt();
		int x = s.nextInt();
		System.out.println(">");
		Scanner in2 = new Scanner(System.in);
		for (int i=0; i<n; i++){
			cola.add(in2.nextInt());
		}
		System.out.println(cola);
		// Segunda línea
		for (int i=0; i<k; i++){
			cola.poll();
		}
		System.out.println(cola);

		// Resultado
		if (cola.isEmpty()) {
			System.out.println("Cola vacía");
		} else {
			System.out.println("Tamaño cola: " + cola.size());
			// Comprueba número
			if (cola.contains(x)) {
				System.out.println("Se encuentra (TRUE): " + x);
			} else {
				PriorityQueue<Integer> colaOrden = new PriorityQueue<Integer>(cola);
				System.out.println("Número menor: " + colaOrden.peek());
			}
		}
		System.out.println("FIN");
		in.close();
		in2.close();	
	}
}
