package Clase4.Bloque4;
import Interfaces.DiccionarioMultipleTDA;

public class IndiceLibro {
    public static void ejecutar(DiccionarioMultipleTDA indice) {
        System.out.println("--- 5) Indice de un Libro de Algoritmos ---");
        indice.InicializarDiccionario();

        int ID_RECURSION = 999;
        System.out.println("Escaneando libro en busqueda de la palabra 'Recursion'...");
        
        indice.Agregar(ID_RECURSION, 12);
        System.out.println("Palabra encontrada en pagina 12.");
        indice.Agregar(ID_RECURSION, 45);
        System.out.println("Palabra encontrada en pagina 45.");
        indice.Agregar(ID_RECURSION, 88);
        System.out.println("Palabra encontrada en pagina 88.");

        System.out.println("> Modelado teorico: Clave: [Palabra] / Valor: [Conjunto de Paginas]\n");
    }
}