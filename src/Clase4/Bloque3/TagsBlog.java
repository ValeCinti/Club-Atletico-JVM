package Clase4.Bloque3;

public class TagsBlog {
    public static void main(String[] args) {
        // Inicializamos el conjunto de tags del post
        ConjuntoTDA tagsPost = new ConjuntoEstatico();
        tagsPost.InicializarConjunto();

        System.out.println("Inicializamos el conjunto y agregamos las tres tags");

        tagsPost.Agregar(10); // #Programacion
        tagsPost.Agregar(20); // #Java
        tagsPost.Agregar(30); // #OOP

        // Intentamos agregar un tag repetido
        System.out.println("Intentando agregar #Java nuevamente...");
        tagsPost.Agregar(20);

        // Verificamos la existencia de un tag específico
        int tagABuscar = 20;
        if (tagsPost.Pertenece(tagABuscar)) {
            System.out.println("El post contiene el tag ID: " + tagABuscar);
        }

        // Contamos cuántos tags tiene el post usando un contador
        int totalTags = contarElementos(tagsPost);
        System.out.println("Total de etiquetas únicas: " + totalTags);
    }

    // contamos elementos
    static int contarElementos(ConjuntoTDA c) {
        int contador = 0;
        ConjuntoTDA aux = clonar(c); // Usamos el clonar para no destruir el original

        while (!aux.ConjuntoVacio()) {
            int elemento = aux.Elegir();
            contador++; // ¡Aquí usamos el incremento!
            aux.Sacar(elemento);
        }
        return contador;
    }

    // duplicamos el conjunto para no perderlo al contar
    static ConjuntoTDA clonar(ConjuntoTDA origen) {
        ConjuntoTDA destino = new ConjuntoEstatico();
        destino.InicializarConjunto();
        ConjuntoTDA temp = new ConjuntoEstatico();
        temp.InicializarConjunto();

        while(!origen.ConjuntoVacio()){
            int x = origen.Elegir();
            temp.Agregar(x);
            origen.Sacar(x);
        }
        while(!temp.ConjuntoVacio()){
            int x = temp.Elegir();
            origen.Agregar(x);
            destino.Agregar(x);
            temp.Sacar(x);
        }
        return destino;
    }
}