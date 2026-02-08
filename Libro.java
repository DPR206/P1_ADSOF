/**
 * Este paquete contiene las clases necesarias para la gestión de libros
 * así como para el tratamiento de una biblioteca categorizando dichos libros
 * en función del año y el género
 */
package p1;

/**
 * Esta clase representa un libro
 * @author Duna Puente y Claudia Saiz
 * @version 1.1
 * Nombre del fichero: Libro.java
 */
public class Libro {
  private String isbn;
  private String titulo;
  private String autor;
  private int ejemplaresDisponibles;
  private int año;
  private String genero;

  /**
   * Crea un nuevo libro
   * 
   * @param isbn isbn del libro
   * @param titulo título del libro
   * @param autor autor del libro
   * @param ejemplaresDisponibles ejemplares disponibles del libro
   * @param año año de publicación del libro
   * @param genero genero literario del libro
   * @return nuevo libro creado
   */
  public Libro(String isbn, String titulo, String autor, int ejemplaresDisponibles, int año, String genero) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.ejemplaresDisponibles = ejemplaresDisponibles;
    this.año = año;
    this.genero = genero;
  }

  /**
   * Crea un nuevo libro
   * 
   * @param isbn isbn del libro
   * @param titulo título del libro
   * @param autor autor del libro
   * @param ejemplaresDisponibles ejemplares disponibles del libro
   * @return nuevo libro creado
   */
  public Libro(String isbn, String titulo, String autor, int ejemplaresDisponibles) {
    this(isbn, titulo, autor, ejemplaresDisponibles, -1, "Desconocido");
  }

  /**
   * Verifica si el libro está disponible
   * 
   * @return true si el libro esta disponible, false en caso contrario
   */
  public boolean estaDisponible() {
    return this.ejemplaresDisponibles > 0;
  }

  /**
   * Presta el libro
   * 
   * @return true si el libro se ha prestado correctamente, false en caso contrario
   */
  public boolean prestar() {
    if(estaDisponible()) {
      this.ejemplaresDisponibles--;
      return true;
    }
    return false;
  }

  /**
   * Devuelve el libro
   */
  public void devolver() {
    this.ejemplaresDisponibles++;
  }

  /**
   * Obtiene el género del libro
   * 
   * @return género del libro
   */
  public String getGenero() {
    return this.genero;
  }

  /**
   * Obtiene el año de publicación del libro
   * 
   * @return año de publicación del libro
   */
  public int getAño() {
    return this.año;
  }

  /**
   * Obtiene la descripción del libro
   * 
   * @return string con la descripción del libro (título, autor, año, género y estado)
   */
  private String descripcion() {
    String estado = this.estaDisponible() ? "Disponible" : "No disponible";
    String year = this.año == -1 ? "" : ". Año: " + this.año;
    String genre = this.genero.equals("Desconocido") ? "" : ". Género: " + this.genero;
    return "'" + this.titulo + "' de " + this.autor + year + genre + " [" + estado + "]";
  }

  /**
   * Obtiene la representación del libro en forma de cadena de texto (isbn, descripción y número de ejemplares disponibles)
   * 
   * @return información del libro
   */
  @Override
  public String toString() {
    return "ISBN: " + this.isbn + ". " + this.descripcion() + " (" + this.ejemplaresDisponibles + " ejemplares disponibles)";
  }

}
