public class NotificadorSMS extends NotificadorDecorator{

    public NotificadorSMS(CajaTe cajaDec) {
        super(cajaDec);
    }

    @Override
    public void notificar(){
        super.notificar();
        System.out.println("Enviando notificación por SMS con " + calcularSobres() + " sobres.");
    }
}
