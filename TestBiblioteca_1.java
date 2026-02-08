/**
 * Este paquete contiene las clases necesarias para la gestión de libros
 * así como para el tratamiento de una biblioteca categorizando dichos libros
 * en función del año y el género
 */
package p1;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase prueba las funcionalidades de la clase biblioteca
 * @author Duna Puente Romera y Claudia Saiz Escribano
 * @version 1.1
 * Nombre del fichero: TestBiblioteca_1.java
 */
public class TestBiblioteca_1 {

	/**
	 * Punto de entrada de la aplicación
	 * El programa prueba a prestar, devolver y añadir libros
	 * 
	 * @param args Argumentos de la línea de comandos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Libro> libros = new ArrayList<> (List.of(
				new Libro("1", "El Quijote", "Miguel de Cervantes", 5, 1605, "Novela"),
				new Libro("2", "El murciélago", "Jo Nesbo", 1, 1997, "Misterio"),
				new Libro("3", "Learn Java", "David Hoffman", 6, 2010, "Educación")));
		Biblioteca biblio = new Biblioteca("BIBLIO");
		for(Libro l :libros)
			biblio.nuevolibro(l);
		
		libros.get(1).prestar();
		System.out.println(biblio);
		
		libros.get(1).devolver();
		System.out.println(biblio);
		
		libros.add(new Libro("4", "Con viento solano", "Ignacio Aldecoa", 1, 2007, "Novela"));
		biblio.nuevolibro(libros.getLast());
		System.out.println(biblio);
		
		List<Libro> libros_año = new ArrayList<> ();
		libros_año = biblio.librosPosterioresA(1997);
		for(Libro l: libros_año)
			System.out.println(l);
		
		List<Libro> libros_genero = new ArrayList<> ();
		libros_genero = biblio.librosPorGenero("Novela");
		for(Libro l: libros_genero)
			System.out.println(l);
	}

}
