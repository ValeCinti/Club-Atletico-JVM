package Clase4.Bloque3;

public interface ConjuntoTDA {
    void InicializarConjunto();
    void Agregar(int x);
    void Sacar(int x);
    boolean ConjuntoVacio();
    boolean Pertenece(int x);
    int Elegir();
}
