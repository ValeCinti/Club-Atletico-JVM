package clase3.bloque1;
import Interfaces.PilaTDA;

public class HistorialDeNavegacion {
    private static final int FI_UBA = 1;
    private static final int CAMPUS_UTN = 2;
    private static final int STACKOVERFLOW = 3;

    public static void ejecutar(PilaTDA pila) {
        System.out.println("1) Historial de navegacion");
        pila.InicializarPila();

        pila.Apilar(FI_UBA);
        System.out.println("Apilar: fi.uba.ar");
        pila.Apilar(CAMPUS_UTN);
        System.out.println("Apilar: campus.utn.edu.ar");
        pila.Apilar(STACKOVERFLOW);
        System.out.println("Apilar: stackoverflow.com");

        System.out.println("Tope actual: " + urlDesdeCodigo(pila.Tope()));
        System.out.println("Usuario aprieta Atras -> Desapilar: " + urlDesdeCodigo(pila.Tope()));
        pila.Desapilar();
        System.out.println("Nuevo tope luego de Atras: " + urlDesdeCodigo(pila.Tope()));
        System.out.println();
    }

    private static String urlDesdeCodigo(int codigo) {
        switch(codigo) {
            case FI_UBA:
                return "fi.uba.ar";
            case CAMPUS_UTN:
                return "campus.utn.edu.ar";
            case STACKOVERFLOW:
                return "stackoverflow.com";
            default:
                return "URL desconocida";
        }
    }
}