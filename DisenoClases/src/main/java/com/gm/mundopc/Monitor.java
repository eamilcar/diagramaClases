
package com.gm.mundopc;

/**
 *
 * @author ESCOBAR
 */
public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    public Monitor(){
        //inicializamos e incrementamos el contador
        this.idMonitor = ++contadorMonitores;
    }
    public Monitor(String marca,double tamano){
        this();
        this.marca=marca;
        this.tamano=tamano;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }


    
}
