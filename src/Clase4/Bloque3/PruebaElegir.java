package Clase4.Bloque3;

public class PruebaElegir {
    public static void main(String[] args) {
        ConjuntoTDA conjunto = new ConjuntoEstatico();
        conjunto.InicializarConjunto();

        conjunto.Agregar(10);
        conjunto.Agregar(20);
        conjunto.Agregar(30);

        // Llamamos a Elegir dos veces
        int primero = conjunto.Elegir();
        int segundo = conjunto.Elegir();

        System.out.println("Primer Elegir: " + primero);
        System.out.println("Segundo Elegir: " + segundo);

        if (primero == segundo) {
            System.out.println("Resultado: Me devolvió el mismo porque no usé Sacar.");
        } else {
            System.out.println("Resultado: Me devolvió uno distinto (poco común en implementaciones estáticas).");
        }
    }
}