package Automoviles;

/**
 *
 * @author HP
 */
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;
    
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }
    
    
    public static void mostrarContador(){
        System.out.println("Total de conteo : "+contadorCoches);
}
    
}
