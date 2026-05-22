package Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();// retorna data, mes, ano e hora
        df[1] = DateFormat.getDateInstance();// retorna dia, mes e ano
        df[2] = DateFormat.getTimeInstance();// retorna somente a hora
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);//retorna dia, mes e ano
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);//
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // retona dia da semana, dia, mes e ano

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
            
        }
    }
}
