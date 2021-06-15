package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio1_pdf {

	public static void main(String[] args) throws IOException {
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Introduzca nº de procesos");
//		String teclado = reader.readLine();
		
		/*
		 * SOLUCION CON COLA
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca nº de procesos");
		int num = in.nextInt();
		Queue<Proceso> procesos = new LinkedList<Proceso>();
		System.out.println("Introduzca procesos (nombre id)");
		for (int i=0; i<num; i++)
			procesos.offer(new Proceso(in.next(), in.nextInt()));
		Queue<Integer> ideal = new LinkedList<Integer>();
		System.out.println("Introduzca orden deseado");
		for (int i=0; i<num; i++)
			ideal.offer(in.nextInt());
		int esperado;
		Proceso proceso;
		
		while (!procesos.isEmpty()) {
			proceso = procesos.poll();
			esperado = ideal.poll();
			while (proceso.getId() != esperado) {
				procesos.offer(proceso);
				proceso = procesos.poll();
			}
			proceso.ejecutar();
		}
		in.close();
		

			
	}

}
