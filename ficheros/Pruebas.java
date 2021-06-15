package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Pruebas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileWriter fich = null;
//		PrintWriter pw = null;
//		fich = new FileWriter("c:/pruebas/fich2.txt");
//		pw = new PrintWriter(fich);
//		pw.println("Linea de texto");
		
//		try
//		{
//			PrintWriter out = null;
//			out = new PrintWriter(new FileWriter("C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\salida.txt", true));
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			String s;
//			while (!(s = br.readLine()).equals("salir"))
//			{
//			out.println(s);
//			}
//			out.close();
//		}
//		catch(IOException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
	
		try {
			InputStream fentrada = new FileInputStream("C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\salida.dat");
			OutputStream fsalida = new FileOutputStream("C:\\Users\\vero\\Desktop\\DAW2\\PROGRAMACION\\U8\\ejemplo.dat");
			byte [] buffer = new byte[256];
			while (true) {
				int n = fentrada.read(buffer);
				if (n<0)
					break;
				fsalida.write(buffer,0,n);;
			}
			fentrada.close();
			fsalida.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
