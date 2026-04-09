package Implementacion;

import Interfaces.PilaTDA;

public class EditorDeCodigo {
    private static final int ESTADO_INICIAL = 100;
    private static final int ESTADO_ESCRIBE_LINEA_1 = 101;
    private static final int ESTADO_ESCRIBE_LINEA_2 = 102;
    private static final int ESTADO_BORRA_POR_ERROR = 103;

    public static void ejecutar(PilaTDA pila) {
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
}