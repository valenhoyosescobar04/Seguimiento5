package TiendaVitual_Ejercicio6;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Main {
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static ArrayList<Pelicula> peliculas = new ArrayList<>();
    private static ArrayList<Object> productos = new ArrayList<>();
    private static ArrayList<Object> carrito = new ArrayList<>();
    private static float totalVentas = 0;

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Agregar Libro\n" +
                            "2. Agregar Pelicula\n" +
                            "3. Mostrar Información\n" +
                            "4. Carrito\n" +
                            "5. Vendedor\n" +
                            "6. Salir"
            ));

            switch (opcion) {
                case 1:
                    String autorLibro = JOptionPane.showInputDialog("Ingrese el autor del Libro: ");
                    String tituloLibro = JOptionPane.showInputDialog("autor del Libro: ");
                    float precioLibro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del Libro: "));
                    libros.add(new Libro(autorLibro, tituloLibro, precioLibro));
                    productos.add(new Libro(autorLibro, tituloLibro, precioLibro));
                    break;

                case 2:
                    String tituloPelicula = JOptionPane.showInputDialog("Ingrese el título de la Pelicula: ");
                    String protagonistaPelicula = JOptionPane.showInputDialog("Ingrese el protagonista de la Pelicula: ");
                    String directorPelicula = JOptionPane.showInputDialog("Ingrese el director de la Pelicula: ");
                    float precioPelicula = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de la Pelicula: "));
                    peliculas.add(new Pelicula(tituloPelicula, protagonistaPelicula, directorPelicula, precioPelicula));
                    productos.add(new Pelicula(tituloPelicula, protagonistaPelicula, directorPelicula, precioPelicula));
                    break;

                case 3:
                    StringBuilder informacion = new StringBuilder();
                    for (Object producto : productos) {
                        if (producto instanceof Libro) {
                            Libro libro = (Libro) producto;
                            informacion.append(libro.toString()).append("\n");
                        } else if (producto instanceof Pelicula) {
                            Pelicula pelicula = (Pelicula) producto;
                            informacion.append(pelicula.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, informacion.toString());
                    break;

                case 4:
                    Carrito carrito = new Carrito();
                    int carritoOltion;
                    do {
                        carritoOltion = Integer.parseInt(JOptionPane.showInputDialog(
                                "1. Agregar al Carrito\n" +
                                        "2. Eliminar del Carrito\n" +
                                        "3. Mostrar Carrito\n" +
                                        "4. Realizar Venta\n" +
                                        "5. Volver al Menú Principal"
                        ));

                        switch (carritoOltion) {
                            case 1:
                                String tituloCarrito = JOptionPane.showInputDialog("Ingrese el título del producto a agregar: ");
                                for (Object producto : productos) {
                                    if (producto instanceof Libro && ((Libro) producto).get();
                                }
                        }
                    }
            }
        }
    }
}
