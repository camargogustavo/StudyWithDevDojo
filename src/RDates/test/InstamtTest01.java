package RDates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstamtTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); //Pega a hora neutra de Greenwich GMT
        System.out.println(now);
        System.out.println(LocalDateTime.now());//Pega a hora da regiao que esta UTC-3
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
    }
}
