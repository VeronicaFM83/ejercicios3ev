package unidad8_ordenacion;

import java.util.Comparator;

public class Comparador implements Comparator<Libro>{

	@Override
	public int compare(Libro libro1, Libro libro2) {
		if (libro1 == libro2)
			return 0;
		int resultado = libro1.getTitulo().compareTo(libro2.getTitulo());
		if (resultado == 0)
			resultado = libro1.getAutor().compareTo(libro2.getAutor());
		return resultado;
	}

}
