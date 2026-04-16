package Clase4.Bloque4;
import Interfaces.DiccionarioMultipleTDA;

public class TraductorIdiomas {
    public static void ejecutar(DiccionarioMultipleTDA traductor) {
        System.out.println("--- 4) Traductor de Idiomas ---");
        traductor.InicializarDiccionario();

        int ID_BANK = 50;
        int ID_BANCO = 1;
        int ID_ORILLA = 2;

        System.out.println("Registrando traducciones para la palabra 'Bank'...");
        traductor.Agregar(ID_BANK, ID_BANCO);
        traductor.Agregar(ID_BANK, ID_ORILLA);

        int[] significados = traductor.Recuperar(ID_BANK);
        System.out.println("> TDA Sugerido: Multiple. Se justifica porque una palabra (como 'Bank') puede tener multiples acepciones (banco financiero o la orilla de un rio), mapeando una unica clave a un conjunto de valores (" + significados.length + " en este caso).\n");
    }
}