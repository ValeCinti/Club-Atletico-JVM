package Clase4.Bloque4;
import Interfaces.DiccionarioSimpleTDA;

public class DNS {
    public static void ejecutar(DiccionarioSimpleTDA dns) {
        System.out.println("--- 7) DNS (Domain Name System) ---");
        dns.InicializarDiccionario();

        int ID_GOOGLE_COM = 1; 
        int IP_SIMULADA = 142250; // Usamos un int chico para simular la IP 142.250.190.46

        System.out.println("Registrando dominio google.com en el servidor DNS local...");
        dns.Agregar(ID_GOOGLE_COM, IP_SIMULADA);

        System.out.println("> Modelado teorico: Clave: [Dominio] / Valor: [Direccion IP]\n");
    }
}