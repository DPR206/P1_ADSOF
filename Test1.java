/**
 * Este paquete contiene las clases necesarias para la gestión de libros
 * así como para el tratamiento de una biblioteca categorizando dichos libros
 * en función del año y el género
 */
package p1;

import java.util.*;
/**
 * Esta clase prueba las funcionalidades de las clases biblioteca y libro
 * @author Duna Puente y Claudia Saiz
 * @version 1.0
 * Nombre del fichero: Test1.java
 */
public class Test1 {

  /**
   * Punto de entrada de la aplicación
   * El programa prueba los métodos librosPorGenero y librosPosteriores
   * 
   * @param args Argumentos de la línea de comandos
   */
  public static void main(String[] args) {

    // Se crean tres libros nuevos y una biblioteca
    Libro libro1 = new Libro("1", "El Quijote", "Miguel de Cervantes", 5, 2012, "Novela");
    Libro libro2 = new Libro("2", "El murcielago", "Jo Nesbo", 1, 2012, "Romantica");
    Libro libro3 = new Libro ("3", "Learn Java", "David Hoffman", 6, 2009, "Novela");
    Biblioteca biblioteca = new Biblioteca("Miguel Delibes");

    // Se añaden los libros a la biblioteca
    biblioteca.nuevolibro(libro1);
    biblioteca.nuevolibro(libro2);
    biblioteca.nuevolibro(libro3);
    
    // Se imprimen por pantalla los libros de género "Novela"
    System.out.println(biblioteca.librosPorGenero("Novela"));
    // Se imprimen por pantalla los libros posteriores a 2011
    System.out.println(biblioteca.librosPosterioresA(2011));
  }
}
