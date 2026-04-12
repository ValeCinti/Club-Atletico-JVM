package Clase4.Bloque2;
import Implementaciones.ColaPrioridadEstatica;

public class GuardiaDelHospital{    
    private final static int jubiladoconbobaso = 100;  
    private final static int SeñoraEmbarazada = 50;  
    private final static int PibeConRaspon = 1;  


    public static void ejecutar(ColaPrioridadEstatica Colaprioridad){
        System.out.println("===Guardia Del Hospital===");

        Colaprioridad.InicializarColaPrioridad();



    }
    
}
