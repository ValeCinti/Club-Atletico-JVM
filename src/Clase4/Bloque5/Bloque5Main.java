package Clase4.Bloque5;

import Implementaciones.ColaPrioridadEstatica;
import Implementaciones.DiccionarioMultipleEstatico;
import Interfaces.ColaPrioridadTDA;
import Interfaces.DiccionarioMultipleTDA;

public class Bloque5Main {
    public static void main(String[] args) {
        System.out.println("=== Bloque 5: Mix de Modelado y Estrategias de Implementacion ===\n");

        ColaPrioridadTDA colaPacientes = new ColaPrioridadEstatica();
        HospitalPremium.ejecutar(colaPacientes);

        DiccionarioMultipleTDA diccTags = new DiccionarioMultipleEstatico();
        SistemaTagsFacultad.ejecutar(diccTags);

        AnalisisEstrategias.ejecutar();
    }
}