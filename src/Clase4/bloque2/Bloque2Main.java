package clase4.bloque2;
import Implementaciones.*;
import Interfaces.*;

public class Bloque2Main {
    public static void main(String[] args) {
        ColaEstaticaa colaE = new ColaEstaticaa();
        ColaPrioridadEstatica COLA = new ColaPrioridadEstatica();
        System.out.println("=== Bloque 2: Pilas (FIFO) ===\n");
        ImpresoraLab.ejecutar(colaE);
        FilaCajero.ejecutar(COLA);



    }
}