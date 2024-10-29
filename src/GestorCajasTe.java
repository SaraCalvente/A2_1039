public class GestorCajasTe {
    private CajaTeGrande cajaGrande = new CajaTeGrande("Envio a Asia");

    public void añadirPaquete (CajaTe caja){
        cajaGrande.añadirCaja(caja);
        System.out.println("Este paquete consta de " + caja.calcularSobres() + " unidades");
    }

    public void calcularEnvio(){
        int total = cajaGrande.calcularSobres();
        System.out.println("El envio a Asia contiene " + total + " unidades de té");
    }

    public void notificarEnvio(){
        cajaGrande.notificar();
    }
}
