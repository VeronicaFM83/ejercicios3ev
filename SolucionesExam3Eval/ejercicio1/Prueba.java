package fp.daw.exprog20210602.ejercicio1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Prueba {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Set<Alumno> alumnos1 = new TreeSet<>();
		alumnos1.add(new Alumno("María", "Fernández", LocalDate.of(1997, 4, 12), "DAW", 1));
		alumnos1.add(new Alumno("Fernando", "López", LocalDate.of(1995, 10, 30), "DAW", 1));
		alumnos1.add(new Alumno("Carmen", "Alvarez", LocalDate.of(2001, 6, 22), "DAW", 1));
		alumnos1.add(new Alumno("Felix", "García", LocalDate.of(2002, 2, 1), "DAW", 1));
		alumnos1.add(new Alumno("Carlos", "Alonso", LocalDate.of(1995, 3, 21), "DAW", 2));
		alumnos1.add(new Alumno("Elena", "Pérez", LocalDate.of(1997, 11, 15), "DAW", 2));
		alumnos1.add(new Alumno("Andrea", "Gutiérrez", LocalDate.of(2003, 7, 23), "DAW", 2));
		alumnos1.add(new Alumno("Antonio", "Suárez", LocalDate.of(1991, 12, 1), "DAW", 2));
		
		alumnos1.add(new Alumno("Teodoro", "Romero", LocalDate.of(1991, 5, 23), "DAM", 1));
		alumnos1.add(new Alumno("Elisa", "Molina", LocalDate.of(1998, 1, 31), "DAM", 1));
		alumnos1.add(new Alumno("Adrián", "Ortega", LocalDate.of(2001, 3, 14), "DAM", 1));
		alumnos1.add(new Alumno("Manuel", "Alonso", LocalDate.of(2002, 7, 7), "DAM", 1));
		alumnos1.add(new Alumno("Ana", "Sanz", LocalDate.of(2001, 6, 3), "DAM", 2));
		alumnos1.add(new Alumno("Carlos", "Rubio", LocalDate.of(1995, 3, 6), "DAM", 2));
		alumnos1.add(new Alumno("Jimena", "Cortes", LocalDate.of(1999, 8, 11), "DAM", 2));
		alumnos1.add(new Alumno("Paula", "Carrasco", LocalDate.of(2002, 9, 23), "DAM", 2));
		
		Set<Alumno> alumnos2 = new TreeSet<>(new AlumnoComparator());
		alumnos2.addAll(alumnos1);
		System.out.println(alumnos1);
		System.out.println(alumnos2);
		
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("alumnos")))) {
			out.writeObject(alumnos1);
			out.writeObject(alumnos2);
		}
	}

}
