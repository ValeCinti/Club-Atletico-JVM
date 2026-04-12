package Interfaces;

public interface ColaPrioridadTDA{
    void InicializarColaPrioridad();
    void AcolarPrioridad(int numero, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    int Primero();
    int Prioridad();
    
    //PCS = Pero Con Strings 
    void InicializarColaPrioridadPCS();
    void AcolarPrioridadPCS (String Persona, int Prioridad);
    void DesacolarPCS();
    int prioridadPCS();
    String PrimeroPCS();
}