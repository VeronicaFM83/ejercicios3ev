package unidad8.ficheros;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio2 {
	
	/* Programa que muestre la diferencia que existe entre utilizar o no utilizar buffer al leer el fichero de texto 
	 * “El Quijote UTF8.txt” carácter a carácter con un FileInputStream.
	 * */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file;
		String path = "C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\El Quijote UTF-8.txt";
		System.out.println("Tiempo sin buffer: " + leer(path, false));
		System.out.println("Tiempo con buffer: " + leer(path, true));
		
	}
	
	static long leer(String path, boolean buffer) throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream(path);
			if (buffer)
				in = new BufferedInputStream(in);
			long t0 = System.nanoTime();
			while (in.read() != -1);
			return System.nanoTime() - t0;
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {}
		}
	}

}
