public class NotificadorDecorator implements Notificador{

    protected CajaTe cajaTe;

    public NotificadorDecorator (CajaTe cajaDec) {
        this.cajaTe = cajaDec;
    }

    @Override
    public int calcularSobres() {
        return cajaTe.calcularSobres();
    }

    @Override
    public void notificar() {
        cajaTe.notificar();
    }
}
