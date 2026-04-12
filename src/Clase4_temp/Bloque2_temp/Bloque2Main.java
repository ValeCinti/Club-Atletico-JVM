package Clase4_temp.Bloque2_temp;
import implementaciones.*;
import interfaces.*;

public class Bloque2Main {
    public static void main(String[] args) {
        ColaTDA colaE = new ColaEstatica();
        ColaPrioridadEstatica COLA = new ColaPrioridadEstatica();
        System.out.println("=== Bloque 2: Pilas (FIFO) ===\n");
        ImpresoraLab.ejecutar(colaE);
        FilaCajero.ejecutar(COLA);



    }
}