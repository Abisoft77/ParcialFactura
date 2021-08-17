package gt.com.edi;

public class ItemsFactura {
    private Producto producto;
    private int cantidad;

    public ItemsFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }
    public double calcularSub(){
        return this.cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto + "\t" + String.format("%.2f", calcularSub());
    }
}
