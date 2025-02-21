package Vehiculo;

public class Vehiculo {
    String tipo;

    public Vehiculo(String tipo) {
    this.tipo = tipo;
       
    }

    void mostrarVehiculo(){
        System.out.println("El vehiculo es un : "+tipo);
    }

}