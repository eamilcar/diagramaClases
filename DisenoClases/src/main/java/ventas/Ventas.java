package ventas;
import com.gm.ventas.*;
public class Ventas {

    public static void main(String[] args) {
        //crear varios objetos de tipo producto
       Producto producto1 = new Producto("camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        
        //creamos un objeto de tipo orden 
        Orden orden1 = new Orden();
        //agregamos los productos a la orden 
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //imprimir la orden 
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        
        orden2.mostrarOrden();
    }
}