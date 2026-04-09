
private static void historialNavegacion(PilaTDA pila) {
        System.out.println("1) Historial de navegacion");
        ///Inicializa la pila, seria como comenzar a documentar el historial de navegacion desde cero.
        pila.InicializarPila();

        pila.Apilar(FI_UBA);
        /// Se ingresó al sitio de la uba, se apila representando que se documenta esto en el historial
        System.out.println("Apilar: fi.uba.ar");
        pila.Apilar(CAMPUS_UTN);
        /// Se ingresa al sitio de la utn, se documenta.
        System.out.println("Apilar: campus.utn.edu.ar");
        pila.Apilar(STACKOVERFLOW);
        /// Se ingresa al sitio de stackoverflow, se documenta.
        System.out.println("Apilar: stackoverflow.com");

        System.out.println("Tope actual: " + urlDesdeCodigo(pila.Tope()));
        /// Se revisa la pagina actual, esto se hace mediante el Tope de la pila.
        System.out.println("Usuario aprieta Atras -> Desapilar: " + urlDesdeCodigo(pila.Tope()));
        /// al desapilar se "Vuelve una pagina para atras" ya que la que se quito fue en la que se estaba.
        pila.Desapilar();
        System.out.println("Nuevo tope luego de Atras: " + urlDesdeCodigo(pila.Tope()));
        System.out.println();
    }