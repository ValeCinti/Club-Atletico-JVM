package Clase4.Bloque3;

public class PadronElectoral {
    public static void main(String[] args) {
        System.out.println("inicializo el nuevo conjunto llamado Padron");
        ConjuntoTDA Padron = new ConjuntoEstatico();
        Padron.InicializarConjunto();
        System.out.print("ingresamos el dni 1234 para probar");
        int DniParaVotar =1234;
        if(!Padron.Pertenece(DniParaVotar)){
            Padron.Agregar(DniParaVotar);
            System.out.println("Voto registrado con exito para el DNI"+DniParaVotar);
        } else {
            System.out.println("ERROR: El DNI " +DniParaVotar + "ya emitio su voto");
        }
        DniParaVotar =5678;
        System.out.print("ingresamos el dni 5678");

        if(!Padron.Pertenece(DniParaVotar)){
            Padron.Agregar(DniParaVotar);
            System.out.println("Voto registrado con exito para el DNI"+DniParaVotar);
        } else {
            System.out.println("ERROR: El DNI " +DniParaVotar + "ya emitio su voto");
        }
        System.out.println("ahora intentamos volver a ingresar un DNI que ya voto");
        if(!Padron.Pertenece(DniParaVotar)){
            Padron.Agregar(DniParaVotar);
            System.out.println("Voto registrado con exito para el DNI"+DniParaVotar);
        } else {
            System.out.println("ERROR: El DNI " +DniParaVotar + "ya emitio su voto");
        }
    }
}