package Empleados;

/**
 *
 * @author HP
 */
public class Empleado {
    protected String nombre;
    protected int salario;
    
    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
    
}
