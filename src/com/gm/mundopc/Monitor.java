package com.gm.mundopc;

public class Monitor {
    
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    public Monitor(){
        
    }
    
    public Monitor(String marca, double tamanio){
        this.marca = marca;
        this.tamanio = tamanio;
        this.idMonitor = ++Monitor.contadorMonitores;
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

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor[" + "idMonitor: " + idMonitor + 
                ", marca: " + marca + 
                ", tamaño: " + tamanio + ']';
    }
    
    
    
}
