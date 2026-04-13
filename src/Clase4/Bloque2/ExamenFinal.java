package Clase4.Bloque2;

import Implementaciones.ColaPrioridadEstatica;

public class ExamenFinal{
    public static void ejecutar(ColaPrioridadEstatica ExamenFinal){ 
        final int MARTA = 5 ;
        final int FRANCHESCO = 5;
        final int HABIBI = 10 ;
        String[] Alumnos;
        int cantidadDealumnos = 0;
        Alumnos = new String[100];

        System.out.println("===Examen Final===");
        ExamenFinal.InicializarColaPrioridad();
        
        System.out.println("Se mete Mirta a la Fila. Hora de llegada(8:00)");
        ExamenFinal.AcolarPrioridad(0, MARTA);
        Alumnos[cantidadDealumnos]="Marta";
        cantidadDealumnos++;
        
        System.out.println("Se mete Franchesco a la Fila. Hora de llegada(8:15)");
        ExamenFinal.AcolarPrioridad(1, FRANCHESCO);
        Alumnos[cantidadDealumnos]="Franchesco";
        cantidadDealumnos++;

        System.out.println("Se mete Habibi la Fila. Hora de llegada(8:30)");
        ExamenFinal.AcolarPrioridad(2, HABIBI);
        Alumnos[cantidadDealumnos]="Habibi";
        cantidadDealumnos++;


        // se puede hacer con un while tranquilamente
        System.out.println("llaman a "+ Alumnos[ExamenFinal.Primero()]+" Para que entre");
        System.out.println(Alumnos[ExamenFinal.Primero()] +" Sale de la Sala");
        ExamenFinal.Desacolar();
        
        System.out.println("se llama a " + Alumnos[ExamenFinal.Primero()] +" para que pase");
        System.out.println(Alumnos[ExamenFinal.Primero()] + "Sale de la fila de buffet");
        ExamenFinal.Desacolar();
        
        System.out.println("Se llama a "+Alumnos[ExamenFinal.Primero()]+"para que pase");
        System.out.println(Alumnos[ExamenFinal.Primero()]+"Sale de la fila");
        ExamenFinal.Desacolar();
        System.out.println("¿Cola vacía?: " + ExamenFinal.ColaVacia());
        if (ExamenFinal.ColaVacia()){
            System.out.println("quedan 0 alumnos en la lista en la fila");
        }
    }
}
