package mundopc;

import com.gm.mundopc.*;

/**
 *
 * @author ESCOBAR
 */
public class MundoPC {

    public static void main(String[] args) {

        //creacion de computadora Toshiba
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshi = new Raton("bluetooth", "Toshiba");
        Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);

        //cracion de computadora dell
        Monitor monitordell = new Monitor("dell", 13);
        Teclado tecladodell = new Teclado("bluetooth", "dell");
        Raton ratondell = new Raton("bluetooth", "dell");
        Computadora compudell = new Computadora("Computadora dell", monitordell, tecladodell, ratondell);

        //cracion de computadora armada
        Computadora computadoraArmada = new Computadora("Compu toshiba armada", monitorToshi, tecladoToshi, ratonToshi);
        
        //Agregamos las computadoras a la orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuToshiba);
        orden1.agregarComputadora(compudell);
        orden1.agregarComputadora(computadoraArmada);

        //imprimir orden 
        orden1.mostrarOrden();

        //agregamos  orden 2
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuToshiba);
        orden2.agregarComputadora(compudell);
        orden2.agregarComputadora(computadoraArmada);
        System.out.println("");
        //imprimir 
        orden2.mostrarOrden();
    }
}
