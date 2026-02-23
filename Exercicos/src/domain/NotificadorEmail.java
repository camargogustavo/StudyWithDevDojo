package domain;

public class NotificadorEmail extends Notificador {
    @Override
    public void enviarMsg(String mensagem) {
        System.out.println("Enviando E-mail com formatação HTML: "+mensagem);
    }

}
