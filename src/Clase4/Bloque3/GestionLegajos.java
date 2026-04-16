package Clase4.Bloque3;

public class GestionLegajos {
    public static void main(String[] args) {
        // Conjunto principal de la Facultad
        ConjuntoTDA legajosFacultad = new ConjuntoEstatico();
        legajosFacultad.InicializarConjunto();

        int legajoAlumno = 45001; // El legajo único del alumno

        // 1. El alumno se anota a Informática
        System.out.println("Inscribiendo al alumno " + legajoAlumno + " en Informática...");
        legajosFacultad.Agregar(legajoAlumno);

        // 2. El mismo alumno se anota a Industrial
        System.out.println("Inscribiendo al alumno " + legajoAlumno + " en Industrial...");
        legajosFacultad.Agregar(legajoAlumno);

        // Verificamos cuántas veces aparece el legajo
        int cantidadTotal = contarLegajos(legajosFacultad);
        System.out.println("Total de legajos únicos en el sistema: " + cantidadTotal);
    }

    static int contarLegajos(ConjuntoTDA c) {
        int contador = 0;
        ConjuntoTDA aux = clonar(c);
        while (!aux.ConjuntoVacio()) {
            int elemento = aux.Elegir();
            contador++;
            aux.Sacar(elemento);
        }
        return contador;
    }

    // metodo pora no borrar el conjunto por contar los elementos
    static ConjuntoTDA clonar(ConjuntoTDA origen) {
        ConjuntoTDA destino = new ConjuntoEstatico();
        destino.InicializarConjunto();
        ConjuntoTDA temp = new ConjuntoEstatico();
        temp.InicializarConjunto();
        while(!origen.ConjuntoVacio()){
            int x = origen.Elegir();
            temp.Agregar(x);
            origen.Sacar(x);
        }
        while(!temp.ConjuntoVacio()){
            int x = temp.Elegir();
            origen.Agregar(x);
            destino.Agregar(x);
            temp.Sacar(x);
        }
        return destino;
    }
}