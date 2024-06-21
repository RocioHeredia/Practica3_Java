public class Producto{
    private String nombre;
    private float precio;
    private int stock;


    public Producto(String nombre, float precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return this.stock;
    }

    public void setCategoria(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + "]";
    }

    
}