package Implementaciones;

public class ABB {

    public int raiz(){
        return 0;
    }

    public ABB hijoIzq(){

    }

    public ABB hijoDer(){

    }

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

    public void eliminarElem(int x){
    }

    boolean arbolVacio(){
        return true;
    }
}