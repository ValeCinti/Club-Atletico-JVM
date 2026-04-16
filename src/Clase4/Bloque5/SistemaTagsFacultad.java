package Clase4.Bloque5;

import Interfaces.DiccionarioMultipleTDA;

public class SistemaTagsFacultad {
    // IDs de Carreras (Claves)
    private static final int LIC_BIOINFORMATICA = 10;
    private static final int ING_INFORMATICA = 11;

    // IDs de Materias (Valores del conjunto)
    private static final int ALGEBRA = 101;
    private static final int QUIMICA = 102;
    private static final int PROGRAMACION = 103;

    public static void ejecutar(DiccionarioMultipleTDA dicc) {
        System.out.println("--- 2) Sistema de Tags de Facultad ---");
        dicc.InicializarDiccionario();

        System.out.println("Asignando materias a Licenciatura en Bioinformatica...");
        dicc.Agregar(LIC_BIOINFORMATICA, ALGEBRA);
        dicc.Agregar(LIC_BIOINFORMATICA, QUIMICA);
        dicc.Agregar(LIC_BIOINFORMATICA, PROGRAMACION);

        System.out.println("Asignando materias a Ingenieria Informatica...");
        dicc.Agregar(ING_INFORMATICA, ALGEBRA);
        dicc.Agregar(ING_INFORMATICA, PROGRAMACION);

        System.out.println("\nMaterias obligatorias recuperadas de Lic. en Bioinformatica:");
        int[] materiasBio = dicc.Recuperar(LIC_BIOINFORMATICA);
        for (int m : materiasBio) {
            System.out.println("- " + traducirMateria(m));
        }

        System.out.println("\nMaterias obligatorias recuperadas de Ing. Informatica:");
        int[] materiasIng = dicc.Recuperar(ING_INFORMATICA);
        for (int m : materiasIng) {
            System.out.println("- " + traducirMateria(m));
        }
        System.out.println();
    }

    private static String traducirMateria(int id) {
        switch(id) {
            case 101: return "Algebra";
            case 102: return "Quimica";
            case 103: return "Programacion";
            default: return "Materia desconocida";
        }
    }
}