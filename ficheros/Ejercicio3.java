package unidad8.ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ejercicio3 {


	public static void main(String[] args) throws IOException {
		String path = "";
		path = "C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\El Quijote UTF-8.txt";
		if (path.isEmpty()) {
			System.out.println("Introduzca la ruta del fichero");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			path = bf.readLine();
		}
			
		leer(path);
	}
	
	static void leer(String path) throws IOException {
		try
		{
			// Para Leer
			File in = new File (path);
			BufferedReader bri = new BufferedReader(new FileReader(in));
			// Para Escribir
			PrintWriter out = null;
			out = new PrintWriter(new FileWriter("C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\salida.txt", true));
			//BufferedReader bro = new BufferedReader(new InputStreamReader(System.in));
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
			out.println("Nº lineas: " + contadorLineas);
			out.println("Nº palabras: " + contadorPalabras);
			out.println("Nº caracteres: " + contadorChar);
			out.close();
			System.out.println("Generado fichero");
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}


}
