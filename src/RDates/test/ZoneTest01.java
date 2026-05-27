package RDates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokyo);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTimeTokyo = now.atZone(zoneTokyo);
        System.out.println(zonedDateTimeTokyo);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTimeInstant = nowInstant.atZone(zoneTokyo);
        System.out.println(zonedDateTimeInstant);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-01:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate fromJapanese = JapaneseDate.from(LocalDate.now());
        System.out.println(fromJapanese);
        LocalDate localDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiera = JapaneseDate.from(localDate);
        System.out.println(meijiera);
    }
}
