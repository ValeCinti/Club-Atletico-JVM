package clase4.bloque2;
import interfaces.*;

public class ImpresoraLab {
    private static final int TP_1 = 1;
    private static final int TP_2 = 2;
    private static final int TP_3 = 3;
    private static final int TP_4 = 4;
    private static final int TP_5 = 5;
    
    public static void ejecutar(ColaTDA ColaE){
        System.out.println("Impresora de laboratorio.");
        ColaE.InicializarCola();
        System.out.println("La cola esta vacia?:" + ColaE.ColaVacia());
        ColaE.Acolar(TP_1);
        ColaE.Acolar(TP_2);
        ColaE.Acolar(TP_3);
        ColaE.Acolar(TP_4);
        ColaE.Acolar(TP_5);
        System.out.println("Primero: " + ColaE.Primero());

        ColaE.Desacolar();
        System.out.println("Primero luego de desacolar: " + ColaE.Primero());

        ColaE.Desacolar();
        System.out.println("Primero luego de desacolar: " + ColaE.Primero()); 
        ColaE.Desacolar();
        System.out.println("Primero luego de desacolar: " + ColaE.Primero()); 

        ColaE.Desacolar();
        System.out.println("Primero luego de desacolar: " + ColaE.Primero()); 

        ColaE.Desacolar();
        System.out.println("¿Cola vacía?: " + ColaE.ColaVacia()); 
    }}