public class CajaTeIndividual implements CajaTe{

    private String tipoTe;
    private int sobres;

    public CajaTeIndividual (String tipo, int sobres){
        this.tipoTe = tipo;
        this.sobres = sobres;
    }

    @Override
    public int calcularSobres() {
        return sobres;
    }

    @Override
    public void notificar() {
        System.out.println("No hay notificación para las cajas individuales.");
    }

    @Override
    public String toString(){
        return "Caja de " + tipoTe;
    }
}
