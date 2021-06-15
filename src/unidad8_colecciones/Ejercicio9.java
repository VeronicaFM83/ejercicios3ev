package unidad8_colecciones;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Ejercicio9 {

	public static void main(String[] args) {

		Queue<String> productos = new LinkedList<String>(); // Uso LinkedList porque permite elementos repetidos
		Queue<Robot> robots = new LinkedList<Robot>();
		Queue<Robot> ocupados = new LinkedList<Robot>();
		Scanner in = new Scanner(System.in);
		
		try {	
			// Procesamos la primera línea
	        String comando = in.nextLine();
	        String [] arrayComando = comando.split(";"); // Divido comando
	        for (String robot: arrayComando) { // Recorro array
	        	String [] arrayRobot = robot.split("-");
	        	Robot nuevo = new Robot(arrayRobot[0],Integer.parseInt(arrayRobot[1]));
	        	robots.add(nuevo); // Añador robot a cola
	        }
	        ocupados.addAll(robots); // Guardamos todos los robots en la coleccion Disponibles
	        
	        // Segunda línea
	        LocalTime hora = LocalTime.parse(in.nextLine());
			//System.out.print(hora.toString());
	        
	        // Resto de líneas
	        String linea = in.nextLine();
	        while (!linea.equalsIgnoreCase("fin")) {
	        	productos.add(linea);
	        	System.out.println(productos);
	        	linea = in.nextLine();
	        }
	        
	        // Comienza el proceso
	        
	        Integer tiempo = 1;
	        System.out.println("Robots: " + robots.size());
	        System.out.println("Robots disponibles: " + ocupados.size());
	        System.out.println("Productos: " + productos.size());
	        while (!productos.isEmpty() && tiempo < 20) {
	        	if (!robots.isEmpty()) {
		        	Iterator<Robot> i = robots.iterator(); // iterador para recorrer lista de robots
		        	while (i.hasNext()) {
			        	Robot test = i.next();
			        	if (tiempo.equals(test.getSegundos())) {
			        		ocupados.offer(test);
			        		robots.remove(test);
			        		System.out.println(ocupados);
			        		System.out.println(robots);
			        		String producto = productos.remove();
			        		String resultado = test.procesado(producto, hora);
			        		System.out.println(resultado);
			        		
			        	} else {
			        		
			        	}
		        	}
		        }
		        tiempo++;
		        System.out.println(tiempo);
	        }
	        
	        // Salidas debug
	        System.out.println(robots);
	        System.out.println(productos);
	        
	        
	        
		} catch (Exception e){
			System.err.println("Error: " + e);
		}
        
        in.close();
	}
	
	
	/*
	static void lineaProcesado(String comando, String delimitador) {
		Scanner in = new Scanner(comando);
		in.useDelimiter(delimitador);
		System.out.print("[");
		while (in.hasNext())
            System.out.print(in.next() + (in.hasNext() ? ", " : "]"));
        in.close();
	}*/

}
