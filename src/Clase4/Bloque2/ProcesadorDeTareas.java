package Clase4.Bloque2;

import Implementaciones.ColaPrioridadEstatica;

public class ProcesadorDeTareas {
    public static void ejecutar(ColaPrioridadEstatica ProcesadorDeTareas ){
        System.out.println("=== Procesador De Tareas ===\n");
        String[] NombresDeTareas;
        NombresDeTareas = new String[100];
        ProcesadorDeTareas.InicializarColaPrioridad();
        final int CambiarLaIntensidadDelBrillo = 10;
        
        final int AbrirElNavegador = 25;

        final int AnalizarElAlmacenamiento = 50;

        int CantidadDeProcesos = 0;
        
        System.out.println("LLega una alerta que avisa que se necesita abrir el navegador");
        System.out.println("La Tarea Abrir el navegador entro en la cola");
        ProcesadorDeTareas.AcolarPrioridad(CantidadDeProcesos, AbrirElNavegador);
        NombresDeTareas[CantidadDeProcesos]="Abrir el navegador";
        CantidadDeProcesos++;

        System.out.println("LLega una alerta que avisa que se quiere cambiar la intensidad del brillo");
        System.out.println("La Tarea Cambiar la intensidad del brillo entro en la cola");
        ProcesadorDeTareas.AcolarPrioridad(CantidadDeProcesos, CambiarLaIntensidadDelBrillo);
        NombresDeTareas[CantidadDeProcesos]="Cambiar la intensidad del brillo";
        CantidadDeProcesos++;

        System.out.println("LLega una alerta que avisa que se necesita analizar el almacenamiento");
        System.out.println("La Tarea Analizar el almacenamiento entro en la cola");
        ProcesadorDeTareas.AcolarPrioridad(CantidadDeProcesos, AnalizarElAlmacenamiento);
        NombresDeTareas[CantidadDeProcesos]="Analizar el almacenamiento";
        CantidadDeProcesos++;

        while(!ProcesadorDeTareas.ColaVacia()){
            System.out.println("La tarea: "+NombresDeTareas[ProcesadorDeTareas.Primero()]+ " entra al ciclo de ejecucion");
            System.out.println("La tarea: "+NombresDeTareas[ProcesadorDeTareas.Primero()] +" Se ejecuto con exito");
            ProcesadorDeTareas.Desacolar();
        }
        System.out.println("No quedan mas tareas en la cola");
    }
}
