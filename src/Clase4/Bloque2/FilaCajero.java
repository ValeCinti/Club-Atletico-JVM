package Clase4.Bloque2;
import Interfaces.*;

public class FilaCajero{
    //OrdenDeLLEGADA
    public static void ejecutar(ColaTDA COLA){
        System.out.println("===FILA CAJERO===");

        COLA.InicializarColaString();
        
        COLA.AcolarString("Panchito");
        System.out.println("llega Panchito, se mete a la cola");
        
        COLA.AcolarString("Marta");
        System.out.println("llega marta, se mete a la fila");
        
        COLA.AcolarString("Cecilio");
        System.out.println("llega Cecilio, se mete a la fila");
        System.out.println("La primera persona en la fila es "+ COLA.PrimeroString());
        
        System.out.println("Se Atiende a " + COLA.PrimeroString());
        COLA.DesacolarString();
        
        System.out.println("Se Atiende a " + COLA.PrimeroString());
        COLA.DesacolarString();
        System.out.println("La primera persona en la fila es "+ COLA.PrimeroString());
        
        COLA.AcolarString("Carlitos");
        System.out.println("llega Carlitos, se mete a la fila");
        
        COLA.DesacolarString();
        System.out.println("Se Atiende a " + COLA.PrimeroString());

        System.out.println("La primera persona en la fila es "+ COLA.PrimeroString());

        System.out.println("primero llega otra persona, se mete a la fila");
        COLA.Desacolar();
        
    }
}