package Examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frecuencia {
	
	/*
	 * Clase que lee fichero, cuenta palabras y escribe fichero
	 */
	
	private Map<String, Integer> mapa = new HashMap<String, Integer>();
	
	public Frecuencia(File arch) throws IOException {
		FileReader fr = null;
	    BufferedReader br = null;
	    String linea;
	    final String delimitador = "\\P{L}+";
		try {
			//arch = new File ("C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\El Quijote UTF-8.txt");
			fr = new FileReader (arch);
			br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				String [] split = linea.split(delimitador);
				for (String palabra: split) {
						if (mapa.containsKey(palabra)) {
							mapa.put(palabra, mapa.get(palabra) + 1);
						} else {
							mapa.put(palabra, 1);
						}
				}
			}
			System.out.println("Fichero leido");
			System.out.println(mapa);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
	}
		
		
		public int cuentaPalabra(String palabra) {
			Integer num = mapa.get(palabra);
			return num==null? 0 : num;		
//			if (num == null) {
//				return 0;
//			} else {
//				return num;
//			}
		}
		
		public void queCodificacion(String path) throws IOException {
			// Averiguar codificacion
			FileInputStream archivo;
			String codificacion ="";
			InputStreamReader isReader = null;
			try {
				archivo = new FileInputStream(path);
				isReader = new InputStreamReader(archivo);
				codificacion = isReader.getEncoding();
				System.out.println(codificacion.equals("")? "" : "CODIFICACION DEL FICHERO: " + codificacion);
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				if (isReader != null)
					isReader.close();
			}
		}
		
		
		public void escribeFichero(String path) throws IOException {
		
			// Escritura fichero
		    FileWriter fich = null;
	        PrintWriter pw = null;
			try {
				
				fich = new FileWriter(path, true);
				pw = new PrintWriter(fich);
				pw.println(mapa);
		
			} catch (Exception e) {
				System.err.println("Ups!");
				e.printStackTrace();
			} finally {
				if (fich != null)
					fich.close();
			}
			
		}
	
}
