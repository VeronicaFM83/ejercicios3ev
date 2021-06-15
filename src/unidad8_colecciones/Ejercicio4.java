package unidad8_colecciones;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palabras lista = new Palabras(); // constructor clase Palabras
		
		Scanner in = new Scanner(System.in);
		String teclado;
		
		do {
			System.out.println("Escriba comando. >");
			teclado = in.nextLine();
			String [] comandos = teclado.split("\\s+");

			switch (comandos[0].toLowerCase()) {
				case "borrar:":
					lista.clearAll();
					/*for (int i=1; i<comandos.length; i++)
					lista.delPalabra(comandos[i]);
					break;
					*/
				case "añadir:":
					for (int i=1; i<comandos.length; i++)
						lista.setPalabra(comandos[i]);
					break;
					
				case "lista":
					if (isNumeric(comandos[1]))
						System.out.println(lista.longPalabras(Integer.parseInt(comandos[1])));
					else
						System.err.println("Comando no válido");
					break;
					
				case "borrar":
					lista.clearAll();
					break;
					
				case "fin":
					System.out.println("Fin del programa");
					break;
					
				default:
					System.err.println("Comando no válido");
				}
			
			
			
		} while (!(teclado.equals("fin")));
		System.out.println("Resultado: " + lista);
		in.close();

	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

}
