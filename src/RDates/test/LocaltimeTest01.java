package RDates.test;

import java.time.LocalTime;

public class LocaltimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timeNOw = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNOw);
        System.out.println(LocalTime.MIN);//Pega o comeco do dia 00:00
        System.out.println(LocalTime.MAX);//Pega o final do dia 23:59:59
    }
}
