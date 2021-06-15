package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio3_pdf {

	public static void main(String[] args) throws IOException {
		/*
		 * Programa que determina si los paréntesis, corchetes y llaves 
		 * utilizados en una expresión introducida por teclado están balanceados
		 * 
		 * Balanceado:
		 * ([]{})
		 * ((({([]())}())[]){})
		 * No balanceado:
		 * ([{})
		 * ((({([]())}())[]){}
		 */
		
		Queue<Character> cola = new LinkedList<Character>();
		Deque<Character> pila2 = new LinkedList<Character>();
		Deque<Character> pila = new LinkedList<Character>(); // doblemente terminada
		System.out.println("Escriba expresión");
		BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
		String expresion = bf.readLine();
        for (int i = 0; i < expresion.length(); i++) {
        	char letra = expresion.charAt(i);
        	if (letra=='a' || letra=='b' || letra=='c') {
        		pila.offer(letra);
        		cola.offer(letra);
        		pila2.push(letra);
        	}
        }
        System.out.println(pila);//pila doblemente terminada
        System.out.println(pila2);
        System.out.println(cola);
        int tamanio = pila.size();
        if (tamanio % 2 != 0) {
        	System.out.println("No balanceado");
        } else {
        	boolean balanceado = true;
//        	while (balanceado && !pila.isEmpty()) { // prueba con pila doblemente terminada
//        		if (pila.pollFirst()!=pila.pollLast()) {
//        			balanceado = false;
//        		}
//        	}
        	while (!pila2.isEmpty() || !cola.isEmpty()) {
        		balanceado = pila2.pop()==cola.poll();
        	}
        	System.out.println(balanceado? "Balanceado" : "No balanceado");
        }
    }

}
