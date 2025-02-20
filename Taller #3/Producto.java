public class Producto{
    String nombre;
    int precio;
    int stock;

    public Producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String mostrarInfo(){
        return "Producto = "+nombre+" costo = $"+precio+" Und. en bodega = "+stock;
    }
    
    }

    class Prueba{
        public static void main (String[] agrs){
        Producto producto1 = new Producto("Toyota",5,5);
        producto1.mostrarInfo();
    }

}
