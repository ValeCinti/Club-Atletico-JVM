package Implementacion;

import Interfaces.PilaTDA;

public class PilaDeLlamadas {
    private static final int FRAME_MAIN = 200;
    private static final int FRAME_CALCULAR_PROMEDIO = 201;
    private static final int FRAME_SUMAR = 202;

    public static void ejecutar(PilaTDA pila) {
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
}