package Implementacion;

import Bloque1Interfaces.PilaTDA;

public class ReversionDeStrings {
    public static void ejecutar(PilaTDA pila, String palabra) {
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
}