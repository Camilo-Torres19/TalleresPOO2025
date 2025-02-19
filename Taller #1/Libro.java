public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroPaginas = 0;
    }

    // Constructor con parametros
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    // Sobrecarga de constructor con 3 parameteros
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void MostrarLibro() {
        System.out.println("El libro es: " + titulo + " escrito por " + autor + " y tiene " + numeroPaginas + " paginas");
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1000);
        libro1.MostrarLibro();

    }

}