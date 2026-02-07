/**
 * 
 */
package p1;

import java.util.*;
/**
 * Esta clase representa una biblioteca
 * @author Claudia Saiz Escribano y Duna Puente Romera. claudia.saiz@estudiante.uam.es y duna.puente@estudiante.uam.es
 * @version 1.0
 * Nombre del fichero: Biblioteca.java
 * 
 */
public class Biblioteca {
	private String nombre;
	private HashMap<String, List<Libro>> libros_genero = new HashMap<>();
	private TreeMap<Integer, List<Libro>> libros_año = new TreeMap<>();
	
	/**
	 * Crea una biblioteca
	 * 
	 * @param nombre nombre de la biblioteca
	 * @return nueva biblioteca creada
	 */
	public Biblioteca(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Añade un nuevo libro a la biblioteca
	 * 
	 * @param nuevolibro libro a añadir
	 */
	public void nuevolibro(Libro nuevolibro) {
		libros_genero.computeIfAbsent(nuevolibro.getGenero(), k -> new ArrayList<>()).add(nuevolibro);
		libros_año.computeIfAbsent(nuevolibro.getAño(), k -> new ArrayList<>()).add(nuevolibro);
		return;
	}
	
	/**
	 * Filtrar los libros de un género
	 * 
	 * @param genero género de los libros a buscar
	 * @return lista de libros del género pedido, si el género no existe se devuelve una lista vacía
	 */
	public List<Libro> librosPorGenero(String genero) {
		return libros_genero.getOrDefault(genero, new ArrayList<>()); 
	}
	
	/**
	 * Filtrar los libros posteriores a un año
	 * 
	 * @param añoPublicacion año a partir del cual se buscan los libros
	 * @return lista de libros que se publicaron después del año solicitado
	 */
	public List<Libro> librosPosterioresA(int añoPublicacion) {
		List<Libro> librosAño = new ArrayList<>();
		SortedMap <Integer, List<Libro>> tail = libros_año.tailMap(añoPublicacion, false);
		for(List<Libro> listaAño : tail.values())
			librosAño.addAll(listaAño);
		return librosAño;
	}
	
	/**
	 * Obtiene la representación de la biblioteca en forma de cadena de texto,
	 * con su nombre y la información de todos los libros que contiene dividos según su género
	 * 
	 * @return información de la biblioteca
	 */
	@Override
	public String toString(){
		return "Nombre: " + nombre + "\nLibros: \n" + libros_genero;
	}
}
