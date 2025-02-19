public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // constructor con valores genericos
    public Estudiante() {
        this("Estudiantes Desconosido", 0, "Desconocido");
    }

    // Constructor que acepte nombr ey edad como parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor que acepte todos los parametros y utilize this para llamar a otro
    // constructor
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public String toString() {
        return "Estudiante nombre = " + nombre  + ", edad = " + edad +", curso = " + curso;
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }

}
