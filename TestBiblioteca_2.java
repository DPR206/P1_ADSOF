/**
 * Este paquete contiene las clases necesarias para la gestión de libros
 * así como para el tratamiento de una biblioteca categorizando dichos libros
 * en función del año y el género
 */
package p1;

import java.util.*;
/**
 * Esta clase prueba las funcionalidades de la clase biblioteca
 * @author Duna Puente Romera y Claudia Saiz Escribano
 * @version 1.1
 * Nombre del fichero: TestBiblioteca_2.java
 */
public class TestBiblioteca_2 {

	/**
	 * Punto de entrada de la aplicación
	 * El programa prueba a prestar, devolver y añadir libros tanto con género y año como sin él
	 * 
	 * @param args Argumentos de la línea de comandos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Libro> libros = new ArrayList<> (List.of(
				new Libro("1", "El Quijote", "Miguel de Cervantes", 5, 1605, "Novela"),
				new Libro("2", "El murciélago", "Jo Nesbo", 1, 1997, "Misterio"),
				new Libro("3", "Learn Java", "David Hoffman", 6, 2010, "Educación"),
				new Libro("4", "Diez Negritos", "Agatha Christie", 7)));
		Biblioteca biblio = new Biblioteca("BIBLIO");
		for(Libro l :libros)
			biblio.nuevolibro(l);
		
		libros.get(3).prestar();
		System.out.println(biblio);
		
		libros.get(3).devolver();
		System.out.println(biblio);
		
		libros.add(new Libro("4", "Con viento solano", "Ignacio Aldecoa", 1));
		biblio.nuevolibro(libros.getLast());
		System.out.println(biblio);
		
		List<Libro> libros_año = new ArrayList<> ();
		libros_año = biblio.librosPosterioresA(1605);
		for(Libro l: libros_año)
			System.out.println(l);
		
		List<Libro> libros_genero = new ArrayList<> ();
		libros_genero = biblio.librosPorGenero("Novela");
		for(Libro l: libros_genero)
			System.out.println(l);
		
	}

}
