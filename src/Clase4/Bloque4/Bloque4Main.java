package Clase4.Bloque4;

import Implementaciones.DiccionarioMultipleEstatico;
import Implementaciones.DiccionarioSimpleEstatico;
import Interfaces.DiccionarioMultipleTDA;
import Interfaces.DiccionarioSimpleTDA;

public class Bloque4Main {
    public static void main(String[] args) {
        System.out.println("=== Bloque 3: Conjuntos ===\n");

        // Inicializamos las estructuras
        DiccionarioSimpleTDA diccSimple = new DiccionarioSimpleEstatico();
        DiccionarioMultipleTDA diccMultiple = new DiccionarioMultipleEstatico();

        AgendaContactos.ejecutar(diccSimple);
        DiccionarioSinonimos.ejecutar(diccMultiple);
        PuntajesTorneo.ejecutar(diccSimple);
        TraductorIdiomas.ejecutar(diccMultiple);
        IndiceLibro.ejecutar(diccMultiple);
        InscripcionAlumno.ejecutar(diccMultiple);
        DNS.ejecutar(diccSimple);
        ChipotleBot.ejecutar(diccSimple);
        
        System.out.println("Todos los ejercicios del Bloque 4 finalizados.");
    }
}