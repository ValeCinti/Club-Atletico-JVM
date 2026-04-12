package Interfaces;

public interface ColaTDA {
    void InicializarCola();
    void Acolar(int x);
    void Desacolar();
    int Primero();
    boolean ColaVacia();
    //metodos aparte VV
    void InicializarColaString();
    void AcolarString(String s);
    String PrimeroString();
    void DesacolarString();
}