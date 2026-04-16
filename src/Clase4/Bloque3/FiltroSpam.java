package Clase4.Bloque3;
import Interfaces.ConjuntoTDA;

public class FiltroSpam {
    public static void ejecutar(ConjuntoTDA blacklist) {
        System.out.println("--- 3) Simulacion: Filtro de Spam ---");
        blacklist.InicializarConjunto();
        
        // Simulamos IDs de palabras prohibidas
        int CRYPTO = 77;
        int PREMIO = 88;
        int GANA = 99;

        System.out.println("Cargando palabras prohibidas a la Blacklist...");
        blacklist.Agregar(CRYPTO);
        blacklist.Agregar(PREMIO);
        blacklist.Agregar(GANA);

        System.out.println("Analizando Mail A (Contenido: 'Hola, ¿como estas?')");
        int palabraMailA = 10; // Una palabra cualquiera que no es spam
        if (blacklist.Pertenece(palabraMailA)) {
            System.out.println("RESULTADO: Mail A es SPAM.");
        } else {
            System.out.println("RESULTADO: Mail A es SEGURO.");
        }

        System.out.println("Analizando Mail B (Contenido: '¡Gana un premio en Crypto!')");
        int palabraMailB = 77; // Contiene la palabra "Crypto"
        if (blacklist.Pertenece(palabraMailB)) {
            System.out.println("RESULTADO: Mail B detectado como SPAM (Palabra ID " + palabraMailB + " encontrada).");
        }
        System.out.println();
    }
}