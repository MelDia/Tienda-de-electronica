package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado() {

    }

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado: ").append(idTeclado);
        sb.append(", Dispositivo Entrada[").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();

    }
    
    
}
