package Implementaciones;

import Interfaces.*;

public class Arbol {
    public void agregarElem(int x) {
        if(nodo == null) {
            nodo = new NodoABB();
            nodo.info = x;
            nodo.HijoIzq = new ABB();
            nodo.HijoDer = new ABB();
        }
        else if(nodo.info > x) {
            nodo.HijoIzq.agregarElem(x);
        }
        else if(nodo.info < x) {
            nodo.HijoDer.agregarElem(x);
        }
    
    }
}
