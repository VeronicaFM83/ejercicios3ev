package unidad8.mascolecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) throws IOException {
		
		Deque<Integer> pila = new LinkedList<Integer>();
		
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		Scanner s = new Scanner(in.readLine());
		Scanner s = new Scanner("6 22 17 17 10 7 9 14 5 12 7 2");
		while (s.hasNextInt()) {
			pila.push(s.nextInt());
		}
		System.out.println(eliminarSiMayoresEncima(pila));
	}

	public static Deque eliminarSiMayoresEncima(Deque<Integer> pila) {
		Queue<Integer> cola = new LinkedList<Integer>();
		int num = 0;
		if (cola.isEmpty()) {
			cola.offer(pila.poll());
			num = cola.peek();
		}
		while(!pila.isEmpty()) {
			//System.out.println((pila.peek() > num) + " " + pila.peek() + " " + num);
			if (pila.peek() > num) {
				num = pila.pop();
				cola.offer(num);
			}
			else {
				num = pila.peek();
				pila.pop();
			}
			//System.out.println(cola);
		}
		while(!cola.isEmpty())
			pila.push(cola.poll());
		return pila;
		
	}
}
