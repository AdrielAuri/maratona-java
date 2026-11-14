package OOP.classesUtilitarias.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2020-04-20");
        LocalTime hora = LocalTime.parse("09:45:55");

        System.out.println(dataHora);
        System.out.println(date);
        System.out.println(hora);

        LocalDateTime ldt1 = date.atTime(hora);
        LocalDateTime ldt2 = hora.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
