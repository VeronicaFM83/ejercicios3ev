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
		List<String> repetidos = new ArrayList<>();

		for (String a: palabras){
			//System.out.println(a);
			noRepetidos.add(a);
			repetidos.add(a);
		}
		System.out.println("No repe: " + noRepetidos);
		System.out.println("Repe: " + repetidos);
	}

}
