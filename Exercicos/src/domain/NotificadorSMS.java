package domain;

public class NotificadorSMS extends Notificador {
    @Override
    public void enviarMsg(String mensagem) {
        System.out.println("Enviando SMS curto para o celular: "+mensagem);
    }
}
