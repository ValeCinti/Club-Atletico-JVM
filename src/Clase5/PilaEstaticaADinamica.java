package Clase5;

import Implementaciones.PilaDinamica;
import Implementaciones.PilaEstrategia_1;
import Interfaces.PilaTDA;

public class PilaEstaticaADinamica {

    public static void main(String[] args) {

        System.out.print("Pila Estatica a Dinamica\nInicializamos PilaEstatica, PilaEstaticaAux y PilaDinamica.\n");
        PilaTDA PilaEstatica = new PilaEstrategia_1();
        PilaTDA PilaEstaticaAux = new PilaEstrategia_1();
        PilaTDA PilaDinamica = new PilaDinamica();
        
        PilaEstaticaAux.InicializarPila();
        PilaEstatica.InicializarPila();
        PilaDinamica.InicializarPila();

        System.out.print("Llenamos PilaEstatica con 100 elementos.\n");
        for(int i=1; i<=100; i++){
            PilaEstatica.Apilar(i);
        }

        System.out.print("Pasamos todo el contenido de PilaEstatica a PilaEstaticaAux de forma que quede invertido.\n");
        while(!PilaEstatica.PilaVacia()){
            PilaEstaticaAux.Apilar(PilaEstatica.Tope());
            PilaEstatica.Desapilar();
        }

        System.out.print("Pasamos todo el contenido de PilaEstaticaAux a PilaDinamica.");
        while(!PilaEstaticaAux.PilaVacia()){
            PilaDinamica.Apilar(PilaEstaticaAux.Tope());
            PilaEstaticaAux.Desapilar();
        }

        System.out.print("Contenido de PilaDinamica empezando del tope: ");
        while(!PilaDinamica.PilaVacia()){
            System.out.print(PilaDinamica.Tope()+" ");
            PilaDinamica.Desapilar();
        }
    }
}