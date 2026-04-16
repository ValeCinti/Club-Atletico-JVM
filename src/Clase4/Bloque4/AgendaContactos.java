package Clase4.Bloque4;
import Interfaces.DiccionarioSimpleTDA;

public class AgendaContactos {
    public static void ejecutar(DiccionarioSimpleTDA agenda) {
        System.out.println("--- 1) Agenda de Contactos ---");
        agenda.InicializarDiccionario();

        int ID_JUAN = 1;
        int ID_MARTA = 2;
        
        System.out.println("Agregando a Juan (ID " + ID_JUAN + ") con el numero 1122334455.");
        agenda.Agregar(ID_JUAN, 112233445); // Usamos ints para simular el tel

        System.out.println("Agregando a Marta (ID " + ID_MARTA + ") con el numero 1199887766.");
        agenda.Agregar(ID_MARTA, 119988776);

        System.out.println("Juan cambia de numero. Actualizando diccionario...");
        agenda.Agregar(ID_JUAN, 115555555); // El Diccionario Simple pisa el valor si la clave ya existe

        System.out.println("> Modelado: Clave: [Nombre] / Valor: [Telefono]");
        System.out.println("Claves registradas en la agenda actualmente: " + agenda.Claves().length + "\n");
    }
}