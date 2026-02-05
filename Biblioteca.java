import java.util.*;

/**
 * Esta clase representa una biblioteca con una colección de libros
 * @author Duna Puente y Claudia Saiz
 * @version 1.0
 * Nombre del fichero: Biblioteca.java
 */
public class Biblioteca {
  private String nombre;
  private List <Libro> libros = new ArrayList <>();

  /**
   * Crea una nueva biblioteca y le asigna un nombre
   * 
   * @param nombre nombre de la biblioteca
   * @return nueva biblioteca creada
   */
  public Biblioteca(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Añade un libro a la biblioteca
   * 
   * @param libro libro que se añade a la biblioteca
   */
  public void añadirLibro(Libro libro) {
    libros.add(libro);
  }

  /**
   * Obtiene una lista con todos los libros de un género dado
   * 
   * @param genero género literario de los libros a encontrar
   * @return lista con los libros
   */
  public String librosPorGenero(String genero) {
    String resultado = "";

    for(Libro l : libros){
      if(l.getGenero().equals(genero)){
        resultado += l + "\n";
      }
    }
    return resultado;
  }

  /**
   * Obtiene una lista con todos los libros publicados después de un año dado
   * 
   * @param año año a partir del cual se encuentran los libros
   * @return lista con los libros
   */
  public String librosPosterioresA(int añoPublicacion) {
    String resultado = "";

    for(Libro l : libros){
      if(l.getAño() > añoPublicacion){
        resultado += l + "\n";
      }
    }
    return resultado;
  }

  /**
   * Obtiene la representación de la biblioteca en forma de cadena de texto,
   * con su nombre y la información de todos los libros que contiene
   * 
   * @return información de la biblioteca
   */
  @Override
  public String toString(){
    return "Nombre: " + nombre + "\nLibros: \n" + libros;
  }
}