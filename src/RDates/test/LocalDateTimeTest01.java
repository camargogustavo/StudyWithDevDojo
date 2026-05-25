package RDates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        /*LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();*/
        LocalDate date = LocalDate.parse("2022-04-04");
        LocalTime time = LocalTime.parse("23:23:23");
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
