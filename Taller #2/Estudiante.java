public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Estudiante(){
        this("desconocido",0);
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Método estático que intenta usar this (esto generará un error)
    /* public static void metodoEstatico() {
        System.out.println("Nombre: " + this.nombre); // Error: No se puede usar this en un contexto estático
    } */

    // Método estático corregido
    public static void metodoEstatico(Estudiante estudiante) {
        System.out.println("Nombre: " + estudiante.nombre);
    }

    public static void main(String[] args) {
        // Crear un objeto usando el constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        // Crear un objeto usando el constructor con parámetros
        Estudiante estudiante2 = new Estudiante("Juan", 20);
        estudiante2.mostrarDetalles();

        // Llamar al método estático corregido
        metodoEstatico(estudiante2);
    }
}

