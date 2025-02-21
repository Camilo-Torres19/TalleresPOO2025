package Empleados;

/**
 *
 * @author HP
 */
public class Gerente extends Empleado {

    protected String departamento;

    public Gerente(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
protected void mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("Departamento: "+departamento);
}
}
