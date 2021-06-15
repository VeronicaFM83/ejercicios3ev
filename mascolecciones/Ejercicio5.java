package unidad8.mascolecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		Deque<Integer> pila = new LinkedList<Integer>();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(in.readLine());
		s.useDelimiter(",");
		while (s.hasNext()) {
			try {
				String str = s.next();
				int num = Integer.valueOf(str.trim());
				pila.push(num);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		while (s.hasNextInt()) {
//			pila.push(s.nextInt());
//		}
		System.out.println(negativosAbajoPositivosArriba(pila));
		s.close();

	}
	
	public static Deque<Integer> negativosAbajoPositivosArriba(Deque<Integer> pila) {
		Queue<Integer> cola = new LinkedList<Integer>(pila);
		pila.clear();
		int num;
		int tamanio = cola.size();
		for (int i=1;  i<= tamanio; i++) {
			num = cola.peek();
			if (num > 0) {
				cola.offer(cola.poll()); // retiro el num del inicio y lo paso al final de la cola
			} else {
				pila.push(cola.poll()); // elimina el num de la cola y lo paso a la pila
			}	
		}
		while (!cola.isEmpty()) {
			pila.push(cola.poll()); // los num que quedan en la cola se pasan a la pila
		}	
		return pila;
	}

}
