package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args){
        Teclado teclado1 = new Teclado("USB", "Logitech");
        Raton raton1 = new Raton("Ryzer", "Cable");
        Monitor monitor1 = new Monitor("Samsung", 27.0);
        Computadora computadora1 = new Computadora("Gamer", monitor1, teclado1, raton1);
      
        Teclado teclado2 = new Teclado("Cable", "Microsoft");
        Raton raton2 = new Raton("Microsoft", "USB");
        Monitor monitor2 = new Monitor("LG", 24.0);
        Computadora computadora2 = new Computadora("Casa", monitor2, teclado2, raton2);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        
        orden1.mostrarOrden();
        
        
    }
    
}
