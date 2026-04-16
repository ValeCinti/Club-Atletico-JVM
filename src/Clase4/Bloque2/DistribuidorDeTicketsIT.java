package Clase4.Bloque2;

import Implementaciones.ColaPrioridadEstatica;

public class DistribuidorDeTicketsIT {
    
    public static void ejecutar(ColaPrioridadEstatica DistribuidorDeTicketsIT){
        System.out.println("=== Distribuidor De Tickers IT ===\n");
        String[] NombresDetickets;
        NombresDetickets = new String[100];
        DistribuidorDeTicketsIT.InicializarColaPrioridad();
        final int SeRompioElServidorPrincipal = 999;
        final int EnlaCafeteriaNoConectaElWifi = 10;
        final int NoMeGustaElFondoDePantalla= 0;
        final int NoAndanLosparlantes = 5;
        int CantidadDeTickets = 0;
        
        System.out.println("LLega un ticket que solicita cambiar el fondo de pantalla");
        System.out.println("El ticket entra en la cola");
        DistribuidorDeTicketsIT.AcolarPrioridad(CantidadDeTickets,NoMeGustaElFondoDePantalla);
        NombresDetickets[CantidadDeTickets]="No me gusta el fondo de pantalla";
        CantidadDeTickets++;

        System.out.println("LLega un ticket que solicita revisar los parlantes de una computadora");
        System.out.println("El ticket entra en la cola");
        DistribuidorDeTicketsIT.AcolarPrioridad(CantidadDeTickets,NoAndanLosparlantes);
        NombresDetickets[CantidadDeTickets]="revisar los parlantes";
        CantidadDeTickets++;

        System.out.println("LLega un ticket que solicita Arreglar el servidor principal");
        System.out.println("El ticket entra en la cola");
        DistribuidorDeTicketsIT.AcolarPrioridad(CantidadDeTickets,SeRompioElServidorPrincipal);
        NombresDetickets[CantidadDeTickets]="arreglar el servidor principal";
        CantidadDeTickets++;

        System.out.println("LLega un ticket que solicita Revisar la conectividad del wifi en la cafeteria");
        System.out.println("El ticket entra en la cola");
        DistribuidorDeTicketsIT.AcolarPrioridad(CantidadDeTickets,EnlaCafeteriaNoConectaElWifi);
        NombresDetickets[CantidadDeTickets]="conectividad del wifi en la cafeteria";
        CantidadDeTickets++;

        while(!DistribuidorDeTicketsIT.ColaVacia()){
            System.out.println("El ticket con el nombre de: "+NombresDetickets[DistribuidorDeTicketsIT.Primero()] +" tiene una criticidad de:["+ DistribuidorDeTicketsIT.Prioridad() +"]");
            DistribuidorDeTicketsIT.Desacolar();
        }
        System.out.println("No quedan mas tickets en la cola");
    } 


}
