package unidad8_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio321 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> mapa = new TreeMap<Character, Integer>();
		System.out.println("Texto:");
		String linea = br.readLine().toLowerCase();
		for (char c: linea.toCharArray()) {
			if (!Character.isSpaceChar(c)) {
				if (mapa.containsKey(c)) {
					mapa.put(c,  mapa.get(c) + 1); // devuelve valor (Integer)
				} else {
					mapa.put(c, 1);
				}
			}
		}
		System.out.println(mapa);
	}

}
