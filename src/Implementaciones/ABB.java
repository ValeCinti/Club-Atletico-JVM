package Implementaciones;

import Interfaces.ABBTDA;

public class ABB implements ABBTDA {

    private NodeABB nodo;

    @Override
    public int raiz() {
        return nodo.info;
    }

    @Override
    public ABBTDA hijoIzq() {
        return nodo.HijoIzq;
    }

    @Override
    public ABBTDA hijoDer() {
        return nodo.HijoDer;
    }

    @Override
    public void agregarElem(int x) {
        if (nodo == null) {
            nodo = new NodeABB();
            nodo.info = x;
            nodo.HijoIzq = new ABB();
            nodo.HijoDer = new ABB();
        } else if (nodo.info > x) {
            nodo.HijoIzq.agregarElem(x);
        } else if (nodo.info < x) {
            nodo.HijoDer.agregarElem(x);
        }
    }

    @Override
    public void eliminarElem(int x) {
        if (nodo != null) {
            if (nodo.info == x) {
                // Caso 1: Es una hoja (no tiene hijos)
                if (nodo.HijoIzq.arbolVacio() && nodo.HijoDer.arbolVacio()) {
                    nodo = null;
                }
                // Caso 2: Tiene solo hijo derecho
                else if (nodo.HijoIzq.arbolVacio() && !nodo.HijoDer.arbolVacio()) {
                    nodo = ((ABB) nodo.HijoDer).nodo; // "Puenteamos" el nodo actual
                }
                // Caso 3: Tiene solo hijo izquierdo
                else if (!nodo.HijoIzq.arbolVacio() && nodo.HijoDer.arbolVacio()) {
                    nodo = ((ABB) nodo.HijoIzq).nodo;
                }
                // Caso 4: Tiene ambos hijos
                else {
                    // Buscamos el mayor de los menores (el mayor del subárbol izquierdo)
                    int mayorIzq = buscarMayor(nodo.HijoIzq);
                    nodo.info = mayorIzq; // Reemplazamos el valor
                    nodo.HijoIzq.eliminarElem(mayorIzq); // Eliminamos el nodo duplicado abajo
                }
            } else if (nodo.info > x) {
                nodo.HijoIzq.eliminarElem(x); // Buscamos a la izquierda
            } else if (nodo.info < x) {
                nodo.HijoDer.eliminarElem(x); // Buscamos a la derecha
            }
        }
    }

    // Método privado auxiliar para encontrar el mayor valor de un subárbol
    private int buscarMayor(ABBTDA arbol) {
        if (arbol.hijoDer().arbolVacio()) {
            return arbol.raiz();
        } else {
            return buscarMayor(arbol.hijoDer());
        }
    }

    @Override
    public boolean arbolVacio() {
        return nodo == null;
    }
}