package Clase4.Bloque4;
import Interfaces.DiccionarioMultipleTDA;

public class DiccionarioSinonimos {
    public static void ejecutar(DiccionarioMultipleTDA dicc) {
        System.out.println("--- 2) Diccionario de Sinonimos ---");
        dicc.InicializarDiccionario();

        int ID_FELIZ = 100;
        int ID_ALEGRE = 101;
        int ID_CONTENTO = 102;

        System.out.println("Agregando sinonimos para la palabra 'Feliz' (ID " + ID_FELIZ + ").");
        dicc.Agregar(ID_FELIZ, ID_ALEGRE);
        dicc.Agregar(ID_FELIZ, ID_CONTENTO);

        int[] sinonimos = dicc.Recuperar(ID_FELIZ);
        System.out.println("Cantidad de sinonimos encontrados para 'Feliz': " + sinonimos.length);
        System.out.println("> Modelado: Clave: [Palabra] / Valor: [Conjunto de Sinonimos]\n");
    }
}