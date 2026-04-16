package Clase4.Bloque2;

import Implementaciones.ColaPrioridadEstatica;

public class EmbarqueDeAerolineas {
    public static void ejecutar(ColaPrioridadEstatica cola) {
        System.out.println("=== Embarque de Aerolineas ===\n");
        cola.InicializarColaPrioridadPCS();
        
        final int MOVILIDAD_REDUCIDA = 3;
        final int BUSINESS = 2;
        final int MORTALES = 1;
        
        System.out.println("Llega pasajero de clase Economica (Mortal 1)");
        cola.AcolarPrioridadPCS("Mortal 1", MORTALES);
        
        System.out.println("Llega pasajero con Movilidad Reducida");
        cola.AcolarPrioridadPCS("Pasajero Movilidad Reducida", MOVILIDAD_REDUCIDA);
        
        System.out.println("Llega pasajero de clase Business");
        cola.AcolarPrioridadPCS("Pasajero Business", BUSINESS);
        
        System.out.println("Llega otro pasajero de clase Economica (Mortal 2)");
        cola.AcolarPrioridadPCS("Mortal 2", MORTALES);
        
        System.out.println("\nComenzando el embarque:");
        while (!cola.ColaVacia()) {
            System.out.println("Sube al avion: " + cola.PrimeroPCS() + " (Prioridad: " + cola.prioridadPCS() + ")");
            cola.DesacolarPCS();
        }
        
        // Respuesta a la consigna teórica de la guía
        System.out.println("\nComportamiento ante igual prioridad:");
        System.out.println("Gracias a la condicion 'prioridades[i] < Prioridad' en ColaPrioridadEstatica,");
        System.out.println("si dos personas tienen la misma prioridad, se respeta el orden de llegada (FIFO entre ellos).\n");
    }
}