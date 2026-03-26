import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class Main {
    private static final int FI_UBA = 1;
    private static final int CAMPUS_UTN = 2;
    private static final int STACKOVERFLOW = 3;

    private static final int ESTADO_INICIAL = 100;
    private static final int ESTADO_ESCRIBE_LINEA_1 = 101;
    private static final int ESTADO_ESCRIBE_LINEA_2 = 102;
    private static final int ESTADO_BORRA_POR_ERROR = 103;

    private static final int FRAME_MAIN = 200;
    private static final int FRAME_CALCULAR_PROMEDIO = 201;
    private static final int FRAME_SUMAR = 202;

    private static final int DIR_C = 300;
    private static final int DIR_USUARIOS = 301;
    private static final int DIR_DOCUMENTOS = 302;

    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();

        System.out.println("=== Bloque 1: Pilas (LIFO) ===\n");

        historialNavegacion(pila);
        undoEditorCodigo(pila);
        balanceoParentesis(pila, "((a+b)*c)");
        reversionString(pila, "ALGORITMOS");
        pilaLlamadas(pila);
        navegacionDirectorios(pila);
    }

    private static void historialNavegacion(PilaTDA pila) {
        System.out.println("1) Historial de navegacion");
        ///Inicializa la pila, seria como comenzar a documentar el historial de navegacion desde cero.
        pila.InicializarPila();

        pila.Apilar(FI_UBA);
        /// Se ingresó al sitio de la uba, se apila representando que se documenta esto en el historial
        System.out.println("Apilar: fi.uba.ar");
        pila.Apilar(CAMPUS_UTN);
        /// Se ingresa al sitio de la utn, se documenta.
        System.out.println("Apilar: campus.utn.edu.ar");
        pila.Apilar(STACKOVERFLOW);
        /// Se ingresa al sitio de stackoverflow, se documenta.
        System.out.println("Apilar: stackoverflow.com");

        System.out.println("Tope actual: " + urlDesdeCodigo(pila.Tope()));
        /// Se revisa la pagina actual, esto se hace mediante el Tope de la pila.
        System.out.println("Usuario aprieta Atras -> Desapilar: " + urlDesdeCodigo(pila.Tope()));
        /// al desapilar se "Vuelve una pagina para atras" ya que la que se quito fue en la que se estaba.
        pila.Desapilar();
        System.out.println("Nuevo tope luego de Atras: " + urlDesdeCodigo(pila.Tope()));
        System.out.println();
    }

    private static void undoEditorCodigo(PilaTDA pila) {
        System.out.println("2) Editor de codigo (Undo/Deshacer)");
        pila.InicializarPila();

        pila.Apilar(ESTADO_INICIAL);
        System.out.println("Apilar estado: " + estadoCodigoDesdeId(ESTADO_INICIAL));
        pila.Apilar(ESTADO_ESCRIBE_LINEA_1);
        System.out.println("Apilar estado: " + estadoCodigoDesdeId(ESTADO_ESCRIBE_LINEA_1));
        pila.Apilar(ESTADO_ESCRIBE_LINEA_2);
        System.out.println("Apilar estado: " + estadoCodigoDesdeId(ESTADO_ESCRIBE_LINEA_2));
        pila.Apilar(ESTADO_BORRA_POR_ERROR);
        System.out.println("Apilar estado: " + estadoCodigoDesdeId(ESTADO_BORRA_POR_ERROR));

        System.out.println("Undo -> se desapila el estado actual: " + estadoCodigoDesdeId(pila.Tope()));
        pila.Desapilar();
        System.out.println("Estado recuperado: " + estadoCodigoDesdeId(pila.Tope()));
        System.out.println();
    }

    private static void balanceoParentesis(PilaTDA pila, String expresion) {
        System.out.println("3) Balanceo de parentesis en: " + expresion);
        pila.InicializarPila();

        boolean balanceado = true;
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(') {
                pila.Apilar(c);
                System.out.println("Pos " + i + ": Apilar '(' ");
            } else if (c == ')') {
                if (pila.PilaVacia()) {
                    balanceado = false;
                    System.out.println("Pos " + i + ": ')' sin '(' previo -> desbalanceado");
                    break;
                }
                System.out.println("Pos " + i + ": comparar ')' con Tope()='(' y Desapilar");
                pila.Desapilar();
            }
        }

        if (!pila.PilaVacia()) {
            balanceado = false;
        }

        System.out.println("Resultado balanceo: " + (balanceado ? "correcto" : "incorrecto"));
        System.out.println();
    }

    private static void reversionString(PilaTDA pila, String palabra) {
        System.out.println("4) Reversion de string: " + palabra);
        pila.InicializarPila();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            pila.Apilar(letra);
            System.out.println("Apilar letra: " + letra);
        }

        StringBuilder invertida = new StringBuilder();
        while (!pila.PilaVacia()) {
            char letra = (char) pila.Tope();
            invertida.append(letra);
            System.out.println("Desapilar letra: " + letra);
            pila.Desapilar();
        }

        System.out.println("Palabra invertida: " + invertida);
        System.out.println();
    }

    private static void pilaLlamadas(PilaTDA pila) {
        System.out.println("5) Pila de llamadas (Call Stack)");
        pila.InicializarPila();

        pila.Apilar(FRAME_MAIN);
        System.out.println("Entra Main() -> Tope: " + nombreFrame(pila.Tope()));
        calcularPromedio(pila);
        System.out.println("Vuelve a Main() -> Tope: " + nombreFrame(pila.Tope()));
        pila.Desapilar();

        System.out.println();
    }

    private static void calcularPromedio(PilaTDA pila) {
        pila.Apilar(FRAME_CALCULAR_PROMEDIO);
        System.out.println("Main llama a CalcularPromedio() -> Tope: " + nombreFrame(pila.Tope()));
        sumar(pila);
        pila.Desapilar();
    }

    private static void sumar(PilaTDA pila) {
        pila.Apilar(FRAME_SUMAR);
        System.out.println("CalcularPromedio llama a Sumar() -> Tope durante la suma: " + nombreFrame(pila.Tope()));
        pila.Desapilar();
    }

    private static void navegacionDirectorios(PilaTDA pila) {
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

    private static String urlDesdeCodigo(int codigo) {
        switch (codigo) {
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

    private static String estadoCodigoDesdeId(int id) {
        switch (id) {
            case ESTADO_INICIAL:
                return "Codigo vacio";
            case ESTADO_ESCRIBE_LINEA_1:
                return "Se agrega linea: int x = 10;";
            case ESTADO_ESCRIBE_LINEA_2:
                return "Se agrega linea: System.out.println(x);";
            case ESTADO_BORRA_POR_ERROR:
                return "Se borra una linea por error";
            default:
                return "Estado desconocido";
        }
    }

    private static String nombreFrame(int frameId) {
        switch (frameId) {
            case FRAME_MAIN:
                return "Main()";
            case FRAME_CALCULAR_PROMEDIO:
                return "CalcularPromedio()";
            case FRAME_SUMAR:
                return "Sumar()";
            default:
                return "Frame desconocido";
        }
    }

    private static String directorioDesdeId(int id) {
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