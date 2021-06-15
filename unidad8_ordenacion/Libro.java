package unidad8_ordenacion;

public class Libro implements Comparable<Libro>{
	
	private String titulo;
	private String autor;
	
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	
//	@Override
//	public int compareTo(Libro libro) {
//		return this == libro? 0 : autor.compareTo(libro.autor);	
//	}
	
	@Override
	public int compareTo(Libro libro) {
		if (this == libro)
			return 0;
		int resultado = autor.compareTo(libro.autor);
		if (resultado == 0)
			resultado = titulo.compareTo(libro.titulo);
		return resultado;
	}

	@Override
	public String toString() {
		return "Titulo: " + this.titulo + ", Autor: " + this.autor; 
	}

}
