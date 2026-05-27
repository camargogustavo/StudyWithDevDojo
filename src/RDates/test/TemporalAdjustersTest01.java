package RDates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {//Utlizada a manipulacao de data inteira
    public static void main(String[] args) {
        LocalDate  date = LocalDate.now();
        date = date.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
    }
}
