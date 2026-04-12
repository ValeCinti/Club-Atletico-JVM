package Clase4.Bloque2;

import Interfaces.*;

public class BuffetFacultad{
    public static void ejecutar(ColaTDA ColaBuffet){ 
        System.out.println("===FILA BUFFET===");
        ColaBuffet.InicializarColaString();
        
        ColaBuffet.AcolarString("mirta");
        System.out.println("Se mete Mirta a la Fila");
        ColaBuffet.AcolarString("Manuel");
        System.out.println("Se mete Manuel a la Fila");
        ColaBuffet.AcolarString("Agustin");
        System.out.println("Se mete Agustin la Fila");
        
        System.out.println("Se le da comida a" + ColaBuffet.PrimeroString());
        System.out.println(ColaBuffet.PrimeroString() + "Sale de la fila de buffet");
        ColaBuffet.DesacolarString();
        
        System.out.println("Se le da comida a" + ColaBuffet.PrimeroString());
        System.out.println(ColaBuffet.PrimeroString() + "Sale de la fila de buffet");
        ColaBuffet.DesacolarString();
        
        ColaBuffet.AcolarString("Panflin");
        System.out.println("Se mete Panflin a la Fila");
        
        System.out.println("Se le da comida a" + ColaBuffet.PrimeroString());
        System.out.println(ColaBuffet.PrimeroString() + "Sale de la fila de buffet");
        ColaBuffet.DesacolarString();
        
        System.out.println("Se le da comida a" + ColaBuffet.PrimeroString());
        System.out.println(ColaBuffet.PrimeroString() + "Sale de la fila de buffet");
        ColaBuffet.DesacolarString();
        
        ColaBuffet.DesacolarString();
        System.out.println("¿Cola vacía?: " + ColaBuffet.ColaVacia()); 
    }

}
