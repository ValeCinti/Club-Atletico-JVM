package Clase4.Bloque3;
import Implementaciones.*;
import Interfaces.*;

public class FiestaFinCursada {
    public static void main(String[] args) {
        System.out.println("Iniciando la lista de invitados");
        ConjuntoTDA invitados = new ConjuntoEstatico();
        invitados.InicializarConjunto();

        System.out.println("Agregamos invitados: 101, 102, 103");

        int invitado1 = 101; // Zama
        int invitado2 = 102; // Toshi
        int invitado3 = 103; // Rowdy
        int invitado4 =104; //Phos
        int contador = 0;

        if (!invitados.Pertenece(invitado1)) {
            invitados.Agregar(invitado1);
            System.out.println("EXITO: " + invitado1 + " fue exitosamente invitado.");
            contador += 1;
        } else {
            System.out.println("ERROR: " + invitado1 + " ya fue invitado");
        }
        if (!invitados.Pertenece(invitado2)) {
            invitados.Agregar(invitado2);
            System.out.println("EXITO: " + invitado2 + " fue exitosamente invitado.");
            contador += 1;
        } else {
            System.out.println("ERROR: " + invitado2 + " ya fue invitado");
        }
        if (!invitados.Pertenece(invitado3)) {
            invitados.Agregar(invitado3);
            System.out.println("EXITO: " + invitado3 + " fue exitosamente invitado.");
            contador += 1;
        } else {
            System.out.println("ERROR: " + invitado3 + " ya fue invitado");
        }
        if (!invitados.Pertenece(invitado4)) {
            invitados.Agregar(invitado4);
            System.out.println("EXITO: " + invitado4 + " fue exitosamente invitado.");
            contador += 1;
        } else {
            System.out.println("ERROR: " + invitado4 + " ya fue invitado");
        }

        // Intentamos agregar a Toshi (102) de nuevo
        System.out.println("Intentando agregar nuevamente al invitado 102...");

        if (!invitados.Pertenece(invitado2)) {
            invitados.Agregar(invitado2);
            System.out.println("EXITO: " + invitado2 + " fue exitosamente invitado.");
            contador += 1;
        } else {
            System.out.println("ERROR: " + invitado2 + " ya fue invitado");
        }

        System.out.println("Cantidad de invitados en total:"+contador);
    }
}