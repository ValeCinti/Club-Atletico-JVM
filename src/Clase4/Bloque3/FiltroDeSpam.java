package Clase4.Bloque3;

public class FiltroDeSpam {
    public static void main(String[] args) {
        System.out.println("Inicializando Filtro de spam");
        ConjuntoTDA FiltroDeSpam = new ConjuntoEstatico();
        FiltroDeSpam.InicializarConjunto();

        //los siguientes numeros simularían las palabras a filtrar

        int palabra1 =20;
        int palabra2 =30;
        int palabra3 =67;

        FiltroDeSpam.Agregar(palabra1);
        FiltroDeSpam.Agregar(palabra2);
        FiltroDeSpam.Agregar(palabra3);

        // las siguientes variables simularían un mail

        int mail1=44;
        int mail2=67;
        int mail3=17;

        if (!FiltroDeSpam.Pertenece(mail1)) {
            System.out.println("El mail analizado no contiene ninguna de las palabras filtradas");
        } else {
            System.out.println("El mail analizado contenia una de las palabras a filtrar");
        }

        if (!FiltroDeSpam.Pertenece(mail2)) {
            System.out.println("El mail analizado no contiene ninguna de las palabras filtradas");
        } else {
            System.out.println("El mail analizado contenia una de las palabras a filtrar");
        }

        if (!FiltroDeSpam.Pertenece(mail3)) {
            System.out.println("El mail analizado no contiene ninguna de las palabras filtradas");
        } else {
            System.out.println("El mail analizado contenia una de las palabras a filtrar");
        }






    }
}
