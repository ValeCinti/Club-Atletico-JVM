package Clase4.Bloque5;

import Implementaciones.PilaEstrategia_1;
import Interfaces.ColaPrioridadTDA;
import Interfaces.PilaTDA;

public class HospitalPremium {

    // IDs para simular los síntomas en la Pila (ya que solo acepta enteros)
    private static final int DOLOR_ESTOMAGO = 1;
    private static final int NAUSEAS = 2;
    private static final int DOLOR_PECHO = 3;
    private static final int DIFICULTAD_RESPIRAR = 4;

    public static void ejecutar(ColaPrioridadTDA cola) {
        System.out.println("--- 1) El Hospital Premium ---");
        cola.InicializarColaPrioridadPCS(); // Usamos la variante PCS (Pero Con Strings)

        System.out.println("Ingresa Juan (Prioridad 2 - Leve).");
        cola.AcolarPrioridadPCS("Juan", 2);
        PilaTDA sintomasJuan = new PilaEstrategia_1();
        sintomasJuan.InicializarPila();
        sintomasJuan.Apilar(DOLOR_ESTOMAGO);
        sintomasJuan.Apilar(NAUSEAS);

        System.out.println("Ingresa Marta (Prioridad 10 - Urgencia).");
        cola.AcolarPrioridadPCS("Marta", 10);
        PilaTDA sintomasMarta = new PilaEstrategia_1();
        sintomasMarta.InicializarPila();
        sintomasMarta.Apilar(DOLOR_PECHO);
        sintomasMarta.Apilar(DIFICULTAD_RESPIRAR);

        System.out.println("\nComenzando atencion por orden de prioridad:");
        
        // Atendemos a Marta primero por tener mayor prioridad
        System.out.println("> Paciente a atender: " + cola.PrimeroPCS());
        System.out.println("  Ultimo sintoma detectado: " + traducirSintoma(sintomasMarta.Tope()));
        sintomasMarta.Desapilar();
        System.out.println("  Sintoma anterior: " + traducirSintoma(sintomasMarta.Tope()));
        cola.DesacolarPCS();

        // Luego atendemos a Juan
        System.out.println("> Paciente a atender: " + cola.PrimeroPCS());
        System.out.println("  Ultimo sintoma detectado: " + traducirSintoma(sintomasJuan.Tope()));
        sintomasJuan.Desapilar();
        System.out.println("  Sintoma anterior: " + traducirSintoma(sintomasJuan.Tope()));
        cola.DesacolarPCS();

        System.out.println();
    }

    private static String traducirSintoma(int id) {
        switch(id) {
            case 1: return "Dolor de estomago";
            case 2: return "Nauseas";
            case 3: return "Dolor de pecho";
            case 4: return "Dificultad para respirar";
            default: return "Sintoma desconocido";
        }
    }
}