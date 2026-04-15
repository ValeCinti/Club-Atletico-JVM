package Clase4.Bloque2;
import Implementaciones.*;
import Interfaces.*;

public class Bloque2Main {
    public static void main(String[] args) {
        ColaTDA colaE = new ColaEstatica();
        ColaPrioridadEstatica ColaPrioridad = new ColaPrioridadEstatica();
        
        System.out.println("=== Bloque 2: Pilas (FIFO) ===\n");
        ImpresoraLab.ejecutar(colaE);
        FilaCajero.ejecutar(colaE);
        GuardiaDelHospital.ejecutar(ColaPrioridad);
        BuffetFacultad.ejecutar(colaE);
        ExamenFinal.ejecutar(ColaPrioridad);
        ProcesadorDeTareas.ejecutar(ColaPrioridad);
        DistribuidorDeTicketsIT.ejecutar(ColaPrioridad);

    }
}