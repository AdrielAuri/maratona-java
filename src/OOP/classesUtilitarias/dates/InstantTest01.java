package OOP.classesUtilitarias.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstantTest01 {
    static void main(String[] args) {
        Instant now = Instant.now(); // representado data e horario zulu em nano segundos
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
}
