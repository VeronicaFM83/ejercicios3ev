package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ejercicio4 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\El Quijote UTF-8.txt";
		leer(path);
	}
	
	static void leer(String path) throws IOException {
		FileOutputStream fos = null;
		DataOutputStream out = null;
		try
		{
			// Para Leer
			File in = new File (path);
			BufferedReader bri = new BufferedReader(new FileReader(in));
			// Para Escribir
			fos = new FileOutputStream("C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\salida.dat");
			out = new DataOutputStream(fos);
			// Contadores
			int contadorLineas = 1;
			int contadorPalabras = 0;
			int contadorChar = 0;
			// Comienza
			String str= bri.readLine();
			while (str != null) {
				String [] palabras = str.split("\\P{L}+");
				for (String palabra : palabras) {
					contadorPalabras++;
					char [] caracteres = palabra.toCharArray();
					for (char caracter : caracteres)
						contadorChar++;
				}
				str = bri.readLine();
				contadorLineas++;
			}
			// Escribe resultado en fichero
			out.writeBytes("N� lineas: " + contadorLineas);
			out.writeBytes("N� palabras: " + contadorPalabras);
			out.writeBytes("N� caracteres: " + contadorChar);
			out.close();


		} catch (FileNotFoundException e) {
	        System.out.println(e.getMessage());
	    } catch (EOFException e) {
	        System.out.println("Fin de fichero");
	    } catch (IOException e) {
	        System.out.println(e.getMessage());
	    } finally {
	        try {
	            if (fos != null) {
	                fos.close();
	            }
	            if (out != null) {
	                out.close();
	            }
	        } catch (IOException e) {
	            System.out.println(e.getMessage());                                                               
	        }
	    }
	}

}
