package Libro;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getInfo() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nPáginas: " + paginas;
    }
}