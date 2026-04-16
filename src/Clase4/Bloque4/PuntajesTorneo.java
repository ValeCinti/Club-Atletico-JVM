package Clase4.Bloque4;
import Interfaces.DiccionarioSimpleTDA;

public class PuntajesTorneo {
    public static void ejecutar(DiccionarioSimpleTDA torneo) {
        System.out.println("--- 3) Puntajes de Torneo de E-Sports ---");
        torneo.InicializarDiccionario();

        int ID_FAKER = 1;
        System.out.println("Jugador Faker (ID " + ID_FAKER + ") termina su partida con 5000 puntos.");
        torneo.Agregar(ID_FAKER, 5000);

        System.out.println("Faker juega de nuevo y rompe su record con 7500 puntos. Se actualiza el diccionario.");
        torneo.Agregar(ID_FAKER, 7500);

        System.out.println("> Modelado teorico: Clave: [Usuario] / Valor: [Puntaje Maximo]\n");
    }
}