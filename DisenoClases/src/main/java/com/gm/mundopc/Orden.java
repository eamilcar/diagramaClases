package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden=++contadorOrdenes;
        computadoras= new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
       
        if (this.contadorComputadoras < MAX_COMPUTADORAS) {
              //Agregamos la nueva computadora al arreglo
            //e incrementamos el contador de computadoras

            computadoras[this.contadorComputadoras++]= computadora;
        }else{
            System.out.println("el numero a sido superado de computadoras "+MAX_COMPUTADORAS );
        }
        
    }

    public void mostrarOrden() {
        System.out.println("Orden # " + idOrden);
        System.out.println("Computadoras de la orden "+ idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
                System.out.println(computadoras[i]);
        }
    }
}
