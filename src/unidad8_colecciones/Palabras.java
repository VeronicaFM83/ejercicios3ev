package unidad8_colecciones;

import java.util.Collection;
import java.util.TreeSet;

public class Palabras {
	
	// atributos
	private static  Collection<String> lista;
	
	// constructor
	public Palabras() {
		lista = new TreeSet<String>();
	}
	
	public Palabras(String palabra) {
		this();
		setPalabra(palabra);
	}
	
	// metodos
	public void setPalabra(String palabra) {
		lista.add(palabra);
	}
	
	public void setPalabras(String cadena) {
		String [] palabras = cadena.split("\\s+");
		for (String palabra: palabras){
			lista.add(palabra);
		}
	}
	
	public boolean comprueba(String palabra) {
		if (lista.contains(palabra)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void delPalabra(String palabra) {
		lista.remove(palabra);
	}
	
	public void clearAll() {
		lista.clear();
	}
	
	public String longPalabras(int n) {
		String resultado = "";
		for (String palabra: lista) {
			if(palabra.length()==n) {
				resultado += palabra + " ";
			}
		}
		return resultado.trim();
	}
	
	@Override
	public String toString() {
		String txt = "";
		for (String a: Palabras.lista) {
			txt += a + " ";
		}
		return txt;
	}

	// pongo a prueba la clase
	/*
	public static void main(String[] args) {
		Palabras nuevaPalabra = new Palabras("uno");
		nuevaPalabra.setPalabra("dos");
		nuevaPalabra.setPalabras("tres cuatro");
		nuevaPalabra.setPalabra("dos");
		nuevaPalabra.delPalabra("uno");
		System.out.println(nuevaPalabra.comprueba("tres"));
		System.out.println(nuevaPalabra);
		nuevaPalabra.clearAll();
		System.out.println(nuevaPalabra);
	}
	*/
}
