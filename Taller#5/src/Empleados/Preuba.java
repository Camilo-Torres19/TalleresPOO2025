package Empleados;

/**
 *
 * @author HP
 */
public class Preuba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Perez", 50000);
        Gerente gerente = new Gerente("Ana Gomez", 75000, "Ventas");

        System.out.println("Informacion del Empleado:");
        empleado.mostrarInformacion();

        System.out.println("\nInformacion del Gerente:");
        gerente.mostrarInformacion();
    }
}
