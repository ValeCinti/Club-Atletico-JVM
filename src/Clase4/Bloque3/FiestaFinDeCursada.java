package Clase4.Bloque3;
import Interfaces.ConjuntoTDA;

public class FiestaFinDeCursada {
    public static void ejecutar(ConjuntoTDA invitados) {
        System.out.println("--- 2) Simulacion: Fiesta de Fin de Cursada ---");
        invitados.InicializarConjunto();

        int alumnoA = 1001;
        int alumnoB = 1002;

        System.out.println("Llega el alumno con legajo " + alumnoA + " a la fiesta.");
        if (!invitados.Pertenece(alumnoA)) {
            invitados.Agregar(alumnoA);
            System.out.println("Registro exitoso: " + alumnoA + " ha sido agregado a la lista.");
        }

        System.out.println("Llega el alumno con legajo " + alumnoB + ".");
        if (!invitados.Pertenece(alumnoB)) {
            invitados.Agregar(alumnoB);
            System.out.println("Registro exitoso: " + alumnoB + " ha sido agregado a la lista.");
        }

        System.out.println("El alumno " + alumnoA + " intenta registrarse OTRA VEZ.");
        if (invitados.Pertenece(alumnoA)) {
            System.out.println("AVISO: El legajo " + alumnoA + " ya esta en la lista. No se duplica.");
            invitados.Agregar(alumnoA); // Forzamos el agregar para ver que el TDA lo ignora
        }

        System.out.println("¿El conjunto esta vacio?: " + invitados.ConjuntoVacio());
        System.out.println("Simulacion de fiesta terminada.\n");
    }
}