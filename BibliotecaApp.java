/**
 * Este paquete contiene las clases necesarias para la gestión de libros
 * así como para el tratamiento de una biblioteca categorizando dichos libros
 * en función del año y el género
 */
package p1;

import java.util.*;

/**
 * Esta clase prueba las funcionalidades de la clase libro
 * @author Duna Puente y Claudia Saiz
 * @version 1.1
 * Nombre del fichero: BibliotecaApp.java
 */
public class BibliotecaApp {

  /**
   * Punto de entrada de la aplicación
   * El programa prueba a prestar, devolver y añadir libros
   * 
   * @param args Argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    // Se crea una lista de libros
    List<Libro> libros = new ArrayList <> (List.of(
      new Libro("1", "El Quijote", "Miguel de Cervantes", 5),
      new Libro("2", "El murcielago", "Jo Nesbo", 1),
      new Libro ("3", "Learn Java", "David Hoffman", 6)));
    
    // Se presta un libro y se imprimen todos los libros
    libros.get(1).prestar();
    for(Libro l : libros)
      System.out.println(l);

    // Se devuelve el libro prestado y se imprimen todos los libros
    libros.get(1).devolver();
    System.out.println(libros);

    // Se añade un libro y se imprimen todos los libros
    libros.add(new Libro("4", "Con viento solano", "Ignacio Aldecoa", 1, 2012, "Novela"));
    System.out.println(libros);
  }

}
