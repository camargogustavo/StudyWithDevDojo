package Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        // Quando ver a palavra formatt siginifica que voce esta trasnformando Objeto para String
        // Quando ver a palavra parse siginifica que voce esta trasnformando String  para Objeto

        LocalDate date = LocalDate.now();
        String string1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE);
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        LocalDate parse1 = LocalDate.parse("20260527", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-05-27", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-05-27", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String string4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-05-27T10:47:27.1328887");
        System.out.println(parse4);

        DateTimeFormatter formatterBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBrazil);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("27/05/2026", formatterBrazil);
        System.out.println(parseBR);


        DateTimeFormatter formatterGM = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGR = LocalDate.now().format(formatterGM);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("27.Mai.2026", formatterGM);
        System.out.println(parseGR);

    }
}
