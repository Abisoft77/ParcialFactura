import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;
import gt.com.edi.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Factura factura = new Factura();
        Cliente cliente = new Cliente();
        Producto producto;
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("101", "Gel Antibacterial A", 40.00));
        productos.add(new Producto("102", "Gel Antibacterial B", 54.99));
        productos.add(new Producto("103", "Gel Antibacterial C", 72.80));
        productos.add(new Producto("104", "Gel Antibacterial D", 73.00));
        System.out.println("__________________________");
        System.out.println("*******Venta de gel antibacterial*******");
        System.out.println("=========================================");


        for(int i = 0; i<3; i++){
            System.out.print("Codigo del producto :  ");
            var codigo = entrada.next();
            for (Producto prod : productos) {
                if(codigo.equals(prod.getCodigo())){
                    //System.out.println(prod.getNombre());
                    System.out.print("Cantidad de litros :  ");
                    ItemsFactura item = new ItemsFactura(entrada.nextInt(), prod);
                    factura.agregarPrd(item);
                    System.out.println();
                }
            }
        }
        System.out.print("Ingrese el nombre del cliente : " );
        cliente.setNombre(entrada.next());
        System.out.print("Ingrese el NIT del cliente : " );
        cliente.setNit(entrada.next());
        System.out.println();
        System.out.println("Nombre del cliente : " + cliente.getNombre());
        System.out.println("  \t\t\t NIT   : " + cliente.getNit());
        System.out.println(factura);

    }
}
