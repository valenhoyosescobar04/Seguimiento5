package Libro;

public class Alumno extends Persona {
    private String curso;

    public Alumno(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;

    }

    @Override
    public String getInfo() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCurso: " + curso;
    }
}