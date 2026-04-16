package Clase4.Bloque3;
import Interfaces.ConjuntoTDA;

public class TagsBlog {
    public static void ejecutar(ConjuntoTDA tags) {
        System.out.println("--- 4) Simulacion: Tags de Blog de Ingenieria ---");
        tags.InicializarConjunto();

        int TAG_JAVA = 50;
        int TAG_OOP = 51;

        System.out.println("Agregando tag #Java...");
        tags.Agregar(TAG_JAVA);
        
        System.out.println("Agregando tag #OOP...");
        tags.Agregar(TAG_OOP);

        System.out.println("El autor intenta agregar el tag #Java nuevamente por error.");
        if (tags.Pertenece(TAG_JAVA)) {
            System.out.println("El sistema detecta que #Java ya existe. Conjunto mantiene integridad.");
        } else {
            tags.Agregar(TAG_JAVA);
        }

        System.out.println("¿Por que no usar una Pila?: Porque en los tags no importa el orden de llegada, sino que sean UNICOS.\n");
    }
}