public class Producto{
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo(){
        System.out.println("Producto = "+nombre+" costo = $"+precio+" Und. en bodega = "+stock);
    }
    
    }

    class Prueba{
        public static void main (String[] agrs){
        Producto producto1 = new Producto("Toyota",5,5);
        producto1.mostrarInfo();
    }

}
