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