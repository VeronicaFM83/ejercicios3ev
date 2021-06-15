package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
	
//	Programa que crea dos conjuntos de números enteros con n y m elementos respectivamente y muestra en
//	la consola los números que están en ambos conjuntos. El programa crea cada conjunto leyendo los datos
//	en la entrada estándar de la forma siguiente:
//	• En la primera línea se especifican las cantidades n y m que indican el número de elementos de cada
//	conjunto.
//	• En la segunda línea se especifican, separados por espacios en blanco, los elementos de ambos
//	conjuntos, primero los n elementos del primer conjunto y después los m elementos del segundo
//	conjunto.
//	Ejemplo:
//	Entrada Salida
//	4 3
//	1 3 5 7 3 4 5
//	Salida
//	3 5

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for (int i=1 ; i<=n ; i++) {
			lista1.add(in.nextInt());
		}
		for (int i=1 ; i<=m ; i++) {
			lista2.add(in.nextInt());
		}
		System.out.println("Lista 1: " + lista1.toString());
		System.out.println("Lista 2: " + lista2.toString());
	}

}
