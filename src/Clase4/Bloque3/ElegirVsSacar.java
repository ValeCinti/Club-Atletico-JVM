package Clase4.Bloque3;
import Interfaces.ConjuntoTDA;

public class ElegirVsSacar {
    public static void ejecutar(ConjuntoTDA conjunto) {
        System.out.println("--- 6) Simulacion Tecnica: Elegir vs Sacar ---");
        conjunto.InicializarConjunto();
        
        System.out.println("Agregando elementos 10, 20 y 30 al conjunto...");
        conjunto.Agregar(10);
        conjunto.Agregar(20);
        conjunto.Agregar(30);

        int primero = conjunto.Elegir();
        System.out.println("Llamada 1 a Elegir(): " + primero);
        
        int segundo = conjunto.Elegir();
        System.out.println("Llamada 2 a Elegir(): " + segundo);
        System.out.println("Nota: Elegir() no quita el elemento, por eso se repite: " + primero);

        System.out.println("Ejecutando Sacar(" + primero + ")...");
        conjunto.Sacar(primero);

        int tercero = conjunto.Elegir();
        System.out.println("Llamada 3 a Elegir() despues de Sacar: " + tercero);
        System.out.println("Ahora el 'elegido' cambio porque el anterior ya no pertenece al conjunto.");
        System.out.println();
    }
}