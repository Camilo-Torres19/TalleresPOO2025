class ProductoP {
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso de paquete
    ProductoP(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar los detalles del producto
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}

// Clase de prueba en el mismo paquete
class PruebaProducto {
    public static void main(String[] args) {
        ProductoP producto = new ProductoP("Laptop", 1200.99, 5);
        producto.mostrarInfo();
    }
}
