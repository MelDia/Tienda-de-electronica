package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    public Raton() {

    }

    public Raton(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        this.idRaton = ++Raton.contadorRatones;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton: ").append(idRaton);
        sb.append(", Dispositivo Entrada[").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();

    }
}
