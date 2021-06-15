package unidad8.ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiaFichero {

	public static void main(String[] args) {
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
