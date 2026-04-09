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
    