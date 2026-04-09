package Bloque2Interfaces;

public interface ColaEstatica {
    void InicializarCola();
    void Acolar(int x);
    void Desacolar();
    int Primero();
    boolean ColaVacia();
}