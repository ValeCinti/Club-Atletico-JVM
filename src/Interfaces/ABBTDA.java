package Interfaces;

public interface ABBTDA {
    int raiz();

    ABBTDA hijoIzq();
    ABBTDA hijoDer();

    void agregarElem(int x);
    void eliminarElem(int x);

    boolean arbolVacio();
}