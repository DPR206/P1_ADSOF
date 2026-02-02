public class Libro {
  private String isbn;
  private String titulo;
  private String autor;
  private int ejemplaresDisponibles;

  public Libro(String isbn, String titulo, String autor, int ejemplaresDisponibles) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.ejemplaresDisponibles = ejemplaresDisponibles;
  }

  // Metodo para verificar si el libro está disponible
  public boolean estaDisponible() {
    return this.ejemplaresDisponibles > 0;
  }

  // Metodo para prestar el libro
  public boolean prestar() {
    if(estaDisponible()) {
      this.ejemplaresDisponibles--;
      return true;
    }
    return false;
  }

  // Metodo para devolver el libro
  public void devolver() {
    this.ejemplaresDisponibles++;
  }

  // Metodo para obtener la descripcion del libro
  private String descripcion() {
    String estado = this.estaDisponible() ? "Disponible" : "No disponible";
    return "'" + this.titulo + "' de " + this.autor + " [" + estado + "]";
  }

  @Override
  public  String toString() {
    return "ISBN: " + this.isbn + ". " + this.descripcion() + " (" + this.ejemplaresDisponibles + " ejemplares disponibles)";
  }
}