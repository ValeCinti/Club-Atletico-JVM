package Clase4.Bloque3;
import Interfaces.ConjuntoTDA;

public class GestionLegajos {
    public static void ejecutar(ConjuntoTDA sistema) {
        System.out.println("--- 5) Simulacion: Gestion de Legajos Unicos ---");
        sistema.InicializarConjunto();

        int legajoAlumno = 45678;
        
        System.out.println("Alumno se anota a Ingenieria Informatica (Legajo: " + legajoAlumno + ")");
        sistema.Agregar(legajoAlumno);

        System.out.println("El mismo alumno intenta anotarse a Lic. en Sistemas.");
        if (sistema.Pertenece(legajoAlumno)) {
            System.out.println("El sistema reconoce el legajo " + legajoAlumno + ". Se vincula a la nueva carrera sin duplicar el ID en la DB.");
        } else {
            sistema.Agregar(legajoAlumno);
        }
        System.out.println();
    }
}