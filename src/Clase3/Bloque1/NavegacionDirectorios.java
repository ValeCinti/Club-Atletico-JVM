package Clase3.Bloque1;
import Interfaces.PilaTDA;

public class NavegacionDirectorios {
    private static final int DIR_C = 300;
    private static final int DIR_USUARIOS = 301;
    private static final int DIR_DOCUMENTOS = 302;

    public static void ejecutar(PilaTDA pila) {
        System.out.println("6) Navegacion de directorios");
        pila.InicializarPila();

        pila.Apilar(DIR_C);
        System.out.println("Entrar a C:/ -> Tope: " + directorioDesdeId(pila.Tope()));
        pila.Apilar(DIR_USUARIOS);
        System.out.println("Entrar a Usuarios -> Tope: " + directorioDesdeId(pila.Tope()));
        pila.Apilar(DIR_DOCUMENTOS);
        System.out.println("Entrar a Documentos -> Tope: " + directorioDesdeId(pila.Tope()));

        System.out.println("Subir un nivel -> Desapilar: " + directorioDesdeId(pila.Tope()));
        pila.Desapilar();
        System.out.println("Carpeta actual luego de subir: " + directorioDesdeId(pila.Tope()));

        System.out.println();
    }

    private static String directorioDesdeId(int id){
        switch (id) {
            case DIR_C:
                return "C:/";
            case DIR_USUARIOS:
                return "Usuarios";
            case DIR_DOCUMENTOS:
                return "Documentos";
            default:
                return "Directorio desconocido";
        }
    }
}