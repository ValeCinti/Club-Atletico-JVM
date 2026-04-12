package Clase4.Bloque2;
import Implementaciones.ColaPrioridadEstatica;

public class GuardiaDelHospital{    
    private final static int JUBILADO_CON_BOBAZO = 100;  
    private final static int SENORA_EMBARAZADA= 50;  
    private final static int PIBE_CON_RASPON = 1;  


    public static void ejecutar(ColaPrioridadEstatica Colaprioridad){
        System.out.println("===Guardia Del Hospital===");
        Colaprioridad.InicializarColaPrioridadPCS();
        
        System.out.println("llega Señora embarazada");
        Colaprioridad.AcolarPrioridadPCS("Señora embarazada",SENORA_EMBARAZADA);
        
        Colaprioridad.PrimeroPCS();
        System.out.println("llega Pibe con raspon embarazada");
        
        Colaprioridad.AcolarPrioridadPCS("Pibe con raspon",PIBE_CON_RASPON);
        Colaprioridad.DesacolarPCS();
        System.out.println("la primera persona en la fila es "+Colaprioridad.PrimeroPCS());
        
        System.out.println("llega jubilado con bobaso");
        Colaprioridad.AcolarPrioridadPCS("Jubilado con bobaso",JUBILADO_CON_BOBAZO);
        System.out.println("la primera persona en la fila es "+Colaprioridad.PrimeroPCS());
        Colaprioridad.DesacolarPCS();
        
        
        System.out.println("la primera persona en la fila es "+Colaprioridad.PrimeroPCS());
        Colaprioridad.DesacolarPCS();
        System.out.println("no hay mas gente en la cola");
     
        
    }
}
