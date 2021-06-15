package Examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca ruta del archivo a leer");
		String teclado = reader.readLine();
		File fichero = null;
		try {
			fichero = new File(teclado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (fichero != null) {
			Frecuencia frec = new Frecuencia(fichero);
			System.out.println("Introduzca palabra a buscar");
			teclado = reader.readLine();
			System.out.println(frec.cuentaPalabra(teclado));
			System.out.println("¿Quiere guardar un fichero? S/N");
			teclado = reader.readLine();
			if (teclado.equalsIgnoreCase("S")) {
				System.out.println("Introduzca ruta del archivo a guardar");
				teclado = reader.readLine();
				frec.escribeFichero(teclado);
			}
			System.out.println("Adios");
		} else {
			throw new Exception();
		}
		reader.close();

	}
}
