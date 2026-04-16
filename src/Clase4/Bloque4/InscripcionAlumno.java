package Clase4.Bloque4;
import Interfaces.DiccionarioMultipleTDA;

public class InscripcionAlumno {
    public static void ejecutar(DiccionarioMultipleTDA inscripciones) {
        System.out.println("--- 6) Inscripcion por Alumno ---");
        inscripciones.InicializarDiccionario();

        int LEGAJO = 12345;
        int MATERIA_PROGRA = 10;
        int MATERIA_MATEMATICA = 11;

        System.out.println("El alumno con legajo " + LEGAJO + " se inscribe en Programacion y Matematica.");
        inscripciones.Agregar(LEGAJO, MATERIA_PROGRA);
        inscripciones.Agregar(LEGAJO, MATERIA_MATEMATICA);

        int[] materiasAnotadas = inscripciones.Recuperar(LEGAJO);
        System.out.println("El alumno se anoto con exito a " + materiasAnotadas.length + " materias.");
        System.out.println("> Modelado teorico: Clave: [Legajo] / Valor: [Conjunto de Materias]\n");
    }
}