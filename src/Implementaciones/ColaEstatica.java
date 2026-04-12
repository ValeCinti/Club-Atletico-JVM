package Implementaciones;

import Interfaces.ColaTDA;

public class ColaEstatica implements ColaTDA {

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    private String[] datoStrings;  

    @Override
    public void InicializarCola() {
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Acolar(int x) {
        if (cantidad < MAX) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public int Primero() {
        return datos[0];
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }
    
    // los metodos a continuacion son agregados a mano
    
    @Override
    public void AcolarString(String s){
        if (cantidad < MAX) {
            datoStrings[cantidad] = s;
            cantidad++;
        }
    }

    @Override
    public String PrimeroString(){
        return datoStrings[0];
    }
    @Override
    public void InicializarColaString() {
        datoStrings = new String[MAX];
        cantidad = 0;
    }
    
    @Override 
    public void DesacolarString(){
        if (!ColaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datoStrings[i] = datoStrings[i + 1];
            }
            cantidad--;
        }
    }
}



