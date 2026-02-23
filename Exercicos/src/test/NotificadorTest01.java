package test;

import domain.AlertaSistema;
import domain.Notificador;
import domain.NotificadorEmail;
import domain.NotificadorSMS;

public class NotificadorTest01 {
    public static void main(String[] args) {
        NotificadorEmail email = new NotificadorEmail();
        NotificadorSMS sms = new NotificadorSMS();
        AlertaSistema alerta = new AlertaSistema();

        alerta.dispararAlerta(email, "O servidor reiniciou");
        alerta.dispararAlerta(sms, "O servidor reiniciou");
    }
}
