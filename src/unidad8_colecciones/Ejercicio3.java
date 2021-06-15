package unidad8_colecciones;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();
		in.close();
		String [] palabras = texto.split("\\P{L}+");
		Set<String> noRepetidos = new LinkedHashSet<>();
		Set<String> unicos = new LinkedHashSet<>();
		List<String> todos = new ArrayList<>();
		List<String> repetidos = new ArrayList<>();

		for (String a: palabras){
			if (todos.contains(a)) {
				repetidos.add(a);
				noRepetidos.remove(a);
			} else {
				noRepetidos.add(a);
			}
			todos.add(a);
			unicos.add(a);
//			if (!noRepetidos.add(a))
//				repetidos.add(a);
		}
//		noRepetidos.removeAll(repetidos);
		System.out.println("No repe: " + noRepetidos);
		System.out.println("Repe: " + repetidos);
		System.out.println("Todos: " + todos);
		System.out.println("Unicos: " + unicos);
	}

}
