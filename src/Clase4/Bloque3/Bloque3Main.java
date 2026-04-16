package Clase4.Bloque3;

import Implementaciones.ConjuntoEstatico;
import Interfaces.ConjuntoTDA;

public class Bloque3Main {
    public static void main(String[] args) {
        System.out.println("=== Bloque 3: Conjuntos ===\n");
        
        // Inicializamos una sola instancia para compartir o re-inicializar en cada ejercicio
        ConjuntoTDA conjunto = new ConjuntoEstatico();

        PadronElectoral.ejecutar(conjunto);
        FiestaFinDeCursada.ejecutar(conjunto);
        FiltroSpam.ejecutar(conjunto);
        TagsBlog.ejecutar(conjunto);
        GestionLegajos.ejecutar(conjunto);
        ElegirVsSacar.ejecutar(conjunto);
    }
}