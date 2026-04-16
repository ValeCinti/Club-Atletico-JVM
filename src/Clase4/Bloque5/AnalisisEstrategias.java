package Clase4.Bloque5;

public class AnalisisEstrategias {
    public static void ejecutar() {
        System.out.println("--- 3 y 4) Analisis de Implementacion y Pregunta de Parcial ---");
        System.out.println("Pregunta: ¿Cual de estas estrategias es la mas ineficiente para Apilar y por que?");
        System.out.println("Respuesta: La Estrategia 2 es la mas ineficiente. Al mantener el tope siempre");
        System.out.println("en el indice 0, cada vez que se apila un elemento es necesario desplazar todos");
        System.out.println("los elementos existentes una posicion hacia la derecha[cite: 158, 161].");
        System.out.println("Esto genera un costo de complejidad temporal O(n), mientras que las estrategias");
        System.out.println("1 y 3 son mucho mas rapidas, con un costo O(1), ya que acceden directamente");
        System.out.println("a la posicion libre usando un indice o contador[cite: 162].");
        System.out.println();
    }
}