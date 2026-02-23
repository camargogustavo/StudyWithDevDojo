package domain;

public class AlertaSistema{
    public void dispararAlerta(Notificador notificador, String mensagem){
        System.out.println("Iniciando o disparo do alerta do sistema");

        notificador.enviarMsg(mensagem);
    }
}
