package unidad8.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Programa que reciba a travÈs de un par·metro de lÌnea de comando una ruta dentro del sistema de archivos y muestre en la consola la informaciÛn siguiente:
	ï Si existe el fichero o directorio referenciado.
	ï Si se trata de un fichero o de un directorio.
	ï Nombre del fichero o directorio y permisos de acceso.
	ï Si se trata de un fichero, debe mostrar adem·s el tamaÒo del mismo
	 */
	
	public static void main(String[] args) throws IOException {
		File fichero;
		System.out.print("Ruta: >");
		Scanner in = new Scanner(System.in);
		String ruta = in.nextLine();
		try {
			fichero = new File(ruta);
			if (fichero.exists()) {
				System.out.println("Nombre: " + fichero.getName());
				System.out.print("Tipo: ");
				if (fichero.isFile())
					System.out.println("fichero\nLongitud: " + fichero.length() + " bytes");
				else
					System.out.println("directorio\nContiene " + fichero.list().length + " elementos");
				System.out.println("Permisos: " + (fichero.canWrite() ? "escritura " : "") + (fichero.canRead() ? "lectura " : "") + (fichero.canExecute() ? "ejecuci√≥n" : ""));
			}
			else
				System.out.println("El fichero o directorio no existe");
		} catch(Exception e) {
			System.err.println(e);
		} finally {
			System.out.println("Fin");
		}
		
	}
}
