package Libro_ejercicio3;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public abstract String getInfo();
}
