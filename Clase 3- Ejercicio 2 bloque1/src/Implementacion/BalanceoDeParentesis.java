package Implementacion;

import Bloque1Interfaces.PilaTDA;

public class BalanceoDeParentesis {
    public static void ejecutar(PilaTDA pila, String expresion) {
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
}