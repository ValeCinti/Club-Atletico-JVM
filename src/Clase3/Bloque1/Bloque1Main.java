package clase3.bloque1;
import Interfaces.PilaTDA;
import Implementaciones.Estrategia_1;

public class Bloque1Main {
    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();

        System.out.println("=== Bloque 1: Pilas (LIFO) ===\n");

        // Llamamos al método "ejecutar" de cada una de nuestras clases separadas
        HistorialDeNavegacion.ejecutar(pila);
        EditorDeCodigo.ejecutar(pila);
        BalanceoDeParentesis.ejecutar(pila, "((a+b)*c)");
        ReversionDeStrings.ejecutar(pila, "ALGORITMOS");
        PilaDeLlamadas.ejecutar(pila);
        NavegacionDirectorios.ejecutar(pila);

        
    }
}