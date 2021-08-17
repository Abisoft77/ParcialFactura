package gt.com.edi;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;

    public Producto(String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return codigo + "\t\t\t\t" + nombre + "\t\t\t";
    }
}
