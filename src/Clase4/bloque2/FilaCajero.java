package clase4.bloque2;
import interfaces.*;

public class FilaCajero{
    public static int PrioridadPersona = 1;
    public static int PrioridadSeñoraEmbarazada = 3;
    public static int PrioridadJubilado = 5;
    //OrdenDeLLEGADA
    public static int Persona1 = 1;
    public static int SeñoraEmbarazada = 2;
    public static int Jubilado = 3;
    public static int Persona2 = 4;
    
    public static void ejecutar(ColaPrioridad COLA){
        COLA.InicializarColaPrioridad();
        System.out.println("primero llega una persona, se mete a la fila");
        COLA.AcolarPrioridad(Persona1,PrioridadPersona);
        System.out.println("El primero es persona1");
        System.out.println("primero llega una señora embarazada, se mete a la fila");
        COLA.AcolarPrioridad(SeñoraEmbarazada,PrioridadSeñoraEmbarazada);
        System.out.println("primero llega un Jubilado, se mete a la fila");
        COLA.AcolarPrioridad(Jubilado, PrioridadJubilado);
        System.out.println("primero llega otra persona, se mete a la fila");

        
        
        COLA.Desacolar();
    }
}