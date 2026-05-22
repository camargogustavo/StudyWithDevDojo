package Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //Segue o padrao de duas isos, pt e o br
        Locale lcItaly = new Locale("it", "it");
        Locale lcCH = new Locale("it", "CH");
        Locale lcIndia = new Locale("hi", "IN");
        Locale lcJapan = new Locale("ja", "JP");
        Locale lcHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, lcItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, lcCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, lcIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, lcJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, lcHolanda);

        System.out.println("Italy "+df1.format(calendar.getTime()));
        System.out.println("Suica "+df2.format(calendar.getTime()));
        System.out.println("India "+df3.format(calendar.getTime()));
        System.out.println("Japao "+df4.format(calendar.getTime()));
        System.out.println("Holanda "+df5.format(calendar.getTime()));

        System.out.println(lcItaly.getDisplayCountry());
        System.out.println(lcCH.getDisplayCountry(lcJapan));


    }
}
