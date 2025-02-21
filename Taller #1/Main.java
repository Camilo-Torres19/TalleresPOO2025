public class Main {
    public static void main(String[] args) {
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel Garcia M.",1500);
        CuentaBancaria cuenta1 = new CuentaBancaria(1007976109,500000,"AHORRO");
        Estudiante estudiante1 = new Estudiante("Camilo", 22, "4to Semestre");
        
        System.out.println("**********************************************************");
        estudiante1.mostrarDetalles();;
        cuenta1.MostarCuenta();
        libro3.MostrarLibro();
        System.out.println("**********************************************************");

         
    }
}
