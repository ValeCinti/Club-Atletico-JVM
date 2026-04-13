package Clase4.Bloque2;

import Implementaciones.ColaPrioridadEstatica;

public class EmbarqueDeAerolineas{
    
    public static void ejecutar(ColaPrioridadEstatica EmbarqueDeAerolineas){ 
        final int               JubiladoConAndador = 3 ;
        final int                       Empresario = 2 ;
        final int  PersonaSinNingunaAfeccionFisica = 1 ;
        final int                PersonaConMuletas = 3 ;

        String[] NombresEmbaque;
        int cantidadDeNombresEmbaque = 0;
        NombresEmbaque = new String[100];

        System.out.println("===Embarque de aerolineas===");
        EmbarqueDeAerolineas.InicializarColaPrioridad();
        
        System.out.println("Jubilado con andador Se mete a la cola.");
        EmbarqueDeAerolineas.AcolarPrioridad(0, JubiladoConAndador);
        NombresEmbaque[cantidadDeNombresEmbaque]="Jubilado con andador";
        cantidadDeNombresEmbaque++;
        
        System.out.println("Empresario Se mete a la cola.");
        EmbarqueDeAerolineas.AcolarPrioridad(1, Empresario);
        NombresEmbaque[cantidadDeNombresEmbaque]="Empresario";
        cantidadDeNombresEmbaque++;

        System.out.println("Persona sin ninguna afeccion fisica Se mete la cola");
        EmbarqueDeAerolineas.AcolarPrioridad(2, PersonaSinNingunaAfeccionFisica);
        NombresEmbaque[cantidadDeNombresEmbaque]="Persona Sin Ninguna Afeccion Fisica";
        cantidadDeNombresEmbaque++;

        
        System.out.println("Persona con muletas Se mete a la cola");
        EmbarqueDeAerolineas.AcolarPrioridad(3, PersonaConMuletas);
        NombresEmbaque[cantidadDeNombresEmbaque]="Persona con muletas";
        cantidadDeNombresEmbaque++;
        
        while(!EmbarqueDeAerolineas.ColaVacia()){
            System.out.println("sube al avion "+ NombresEmbaque[EmbarqueDeAerolineas.Primero()]);
            System.out.println(NombresEmbaque[EmbarqueDeAerolineas.Primero()] +" Se sienta en el avion");
            EmbarqueDeAerolineas.Desacolar();
        }
        System.out.println("no queda nadie haciendo la cola para subir al avion");    
    }
}
