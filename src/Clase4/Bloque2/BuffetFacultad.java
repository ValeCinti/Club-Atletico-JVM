package Clase4.Bloque2;

import Interfaces.*;

public class BuffetFacultad{
    public static void ejecutar(ColaTDA colaE){ 
        System.out.println("===FILA BUFFET===");
        colaE.InicializarColaString();
        
        colaE.AcolarString("Mirta");
        System.out.println("Se mete Mirta a la Fila");
        colaE.AcolarString("Manuel");
        System.out.println("Se mete Manuel a la Fila");
        colaE.AcolarString("Agustin");
        System.out.println("Se mete Agustin la Fila");
        
        System.out.println("Se le da comida a" + colaE.PrimeroString());
        System.out.println(colaE.PrimeroString() + "Sale de la fila de buffet");
        colaE.DesacolarString();
        
        System.out.println("Se le da comida a" + colaE.PrimeroString());
        System.out.println(colaE.PrimeroString() + "Sale de la fila de buffet");
        colaE.DesacolarString();
        
        colaE.AcolarString("Pablo");
        System.out.println("Se mete Pablo a la Fila");
        
        System.out.println("Se le da comida a" + colaE.PrimeroString());
        System.out.println(colaE.PrimeroString() + "Sale de la fila de buffet");
        colaE.DesacolarString();
        
        System.out.println("Se le da comida a" + colaE.PrimeroString());
        System.out.println(colaE.PrimeroString() + "Sale de la fila de buffet");
        colaE.DesacolarString();
        
        colaE.DesacolarString();
        System.out.println("¿Cola vacía?: " + colaE.ColaVacia() + "\n"); 
    }
}