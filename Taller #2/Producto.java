public class Producto{
    private String nombre;
    private int edad;

    public Producto(){
        this("Jaime",22);
    }

    public Producto(String nombre, int edad){
        this.nombre = nombre;
        this.edad= edad;
    }
    
    public String toString(){
        return "Descripcion del producto : "+nombre+ ", edad : "+edad;
    }
    public void mostrarDatos(){
        System.out.println(toString());
    }

}