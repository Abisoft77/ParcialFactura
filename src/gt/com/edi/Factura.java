package gt.com.edi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private static final int MAX_ITEMS = 5;
    private ItemsFactura[] items;
    private int contadorItems;
    private Date fecha;

    public Factura() {
        this.items = new ItemsFactura[Factura.MAX_ITEMS];
    }

    public void agregarPrd(ItemsFactura itemsFactura){
        if (contadorItems<MAX_ITEMS){
            this.items[contadorItems++] = itemsFactura;
        }
    }
    public String imprimirFactura(){
        double descuento=0;
        double subtotal=0.0;
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo\t\t\t")
                .append("Producto\t\t\t\t\t\t")
                .append("Sub\n");
        for(ItemsFactura item: items){
            if (item == null) continue;
            sb.append(item);
            sb.append("\n");
        }
        sb.append("\n\n"  );
        subtotal = this.calcularTotal();
        sb.append("SUBTOTAL\t\t\t" + subtotal);
        if (subtotal>500){
            descuento = subtotal * 15 /100;
            sb.append("\nDESCUENTO\t\t\t" + String.format("%.2f", descuento ) );
        }
        sb.append("\n\t\t\t\t----------");
        sb.append("\nTOTAL\t\t\t\t" + String.format("%.2f", subtotal - descuento));
        sb.append("\n\t\t\t\t==========");
        return sb.toString();
    }
    public double calcularTotal(){
        double total = 0;
        for(ItemsFactura item: items){
            if (item == null)continue;
            total += item.calcularSub();
        }
        return total;
    }

    @Override
    public String toString() {
        return imprimirFactura();
    }
}
