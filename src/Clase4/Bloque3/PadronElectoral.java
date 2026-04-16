package Clase4.Bloque3;

import Interfaces.ConjuntoTDA;

public class PadronElectoral {
    public static void ejecutar(ConjuntoTDA padron) {
        System.out.println("--- 1) Padron Electoral ---");
        padron.InicializarConjunto();
        
        System.out.println("Ingresamos el DNI 1234 para probar");
        int dniParaVotar = 1234;
        if(!padron.Pertenece(dniParaVotar)){
            padron.Agregar(dniParaVotar);
            System.out.println("Voto registrado con exito para el DNI " + dniParaVotar);
        } else {
            System.out.println("ERROR: El DNI " + dniParaVotar + " ya emitio su voto");
        }
        
        dniParaVotar = 5678;
        System.out.println("Ingresamos el DNI 5678");
        if(!padron.Pertenece(dniParaVotar)){
            padron.Agregar(dniParaVotar);
            System.out.println("Voto registrado con exito para el DNI " + dniParaVotar);
        } else {
            System.out.println("ERROR: El DNI " + dniParaVotar + " ya emitio su voto");
        }
        
        System.out.println("Ahora intentamos volver a ingresar el DNI 1234 que ya voto");
        dniParaVotar = 1234;
        if(!padron.Pertenece(dniParaVotar)){
            padron.Agregar(dniParaVotar);
            System.out.println("Voto registrado con exito para el DNI " + dniParaVotar);
        } else {
            System.out.println("ERROR: El DNI " + dniParaVotar + " ya emitio su voto");
        }
        System.out.println();
    }
}