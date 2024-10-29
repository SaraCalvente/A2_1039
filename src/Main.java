public class Main {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...\n");

        CajaTeGrande paquete1 = new CajaTeGrande("Paquete Cliente 1");
        CajaTeIndividual caja1 = new CajaTeIndividual("Te Blanco", 60);
        paquete1.añadirCaja(caja1);
        caja1 = new CajaTeIndividual("Te Blanco", 60);
        paquete1.añadirCaja(caja1);
        caja1 = new CajaTeIndividual("Te Verde", 24);
        paquete1.añadirCaja(caja1);

        CajaTeGrande paquete2 = new CajaTeGrande("Paquete Cliente 2");
        CajaTeIndividual caja2 = new CajaTeIndividual("Te Verde", 24);
        paquete2.añadirCaja(caja2);
        caja2 = new CajaTeIndividual("Te Verde", 24);
        paquete2.añadirCaja(caja2);
        caja2 = new CajaTeIndividual("Te Blanco", 60);
        paquete2.añadirCaja(caja2);

        GestorCajasTe envio = new GestorCajasTe();
        envio.añadirPaquete(paquete1);
        envio.añadirPaquete(paquete2);
        envio.calcularEnvio();

    }
}