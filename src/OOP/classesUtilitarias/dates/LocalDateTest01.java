package OOP.classesUtilitarias.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, Month.JANUARY, 1);
        LocalDate horaAtual = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(date);
        System.out.println(horaAtual);

    }
}
