package Libro_ejercicio3;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Agregar Alumno\n" +
                            "2. Agregar Profesor\n" +
                            "3. Mostrar Información\n" +
                            "4. Salir"
            ));

            switch (opcion) {
                case 1:
                    String nombreAlumno = JOptionPane.showInputDialog("Ingrese el nombre del Alumno: ");
                    int edadAlumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Alumno: "));
                    String cursoAlumno = JOptionPane.showInputDialog("Ingrese el curso del Alumno: ");
                    personas.add(new Alumno(nombreAlumno, edadAlumno, cursoAlumno));
                    break;
                case 2:
                    String nombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del Profesor: ");
                    int edadProfesor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Profesor: "));
                    String materiaProfesor = JOptionPane.showInputDialog("Ingrese la materia del Profesor: ");
                    personas.add(new Profesor(nombreProfesor, edadProfesor, materiaProfesor));
                    break;
                case 3:
                    for (Persona persona : personas) {
                        JOptionPane.showMessageDialog(null, persona.getInfo());
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:

            }
