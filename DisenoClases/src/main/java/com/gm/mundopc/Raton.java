
package com.gm.mundopc;

/**
 *
 * @author ESCOBAR
 */
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;
    
    //contador que inicializamos las variables 
    public Raton(String tipoentrada,String marca){
        //usamos super para acceder al constructor de DispositivoEntada
        super(tipoentrada,marca);
        idRaton= ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}';
    }
    
}
