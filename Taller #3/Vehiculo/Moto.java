package Vehiculo;

public class Moto extends Vehiculo{

    public Moto(String tipo){
        super(tipo);
    }

    void mostrarTipo(){
        System.out.println("La moto es una : "+tipo);
    }
    
}
