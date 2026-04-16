package Clase4.Bloque4;
import Interfaces.DiccionarioSimpleTDA;

public class ChipotleBot {
    public static void ejecutar(DiccionarioSimpleTDA bot) {
        System.out.println("--- 8) Chipotle Support Bot (Meme Context) ---");
        bot.InicializarDiccionario();

        int ORDEN_ID = 556677;
        int SCRIPT_REEMBOLSO = 404;

        System.out.println("Cliente se queja de la orden ID " + ORDEN_ID + " (Faltaba guacamole).");
        bot.Agregar(ORDEN_ID, SCRIPT_REEMBOLSO);
        
        System.out.println("Pepper el bot asocio el script " + SCRIPT_REEMBOLSO + " a la orden para ejecutar la devolucion.");
        System.out.println("> Modelado teorico: Clave: [Orden ID] / Valor: [Script Python]\n");
    }
}