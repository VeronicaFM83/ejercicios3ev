package unidad8.mascolecciones;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.valueOf("-55"));
		
		Scanner in = new Scanner("89, -55, -19, 29, 37, -5, 23");
		in.useDelimiter(",");
		while (in.hasNext()) {
			try {
				String s = in.next();
				s = s.trim();
				int num = Integer.valueOf(s);
				System.out.println(num);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
