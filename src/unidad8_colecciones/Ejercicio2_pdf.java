package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ejercicio2_pdf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * Programa que lee por teclado una línea con varios números enteros separados por espacios y los muestra en orden inverso.
		 * SOLUCION CON PILA
		 */
		Deque<Integer> pila = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Números: ");
		Scanner in2 = new Scanner(br.readLine());
		while (in2.hasNextInt())
			pila.push(in2.nextInt());
		while (!pila.isEmpty())
			System.out.printf("%d ", pila.pop());
		in2.close();
	}

}
