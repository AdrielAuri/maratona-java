package OOP.classesUtilitarias.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    static void main(String[] args) {
        LocalDate now = LocalDate.now(); // instanciando data
        now = now.with(ChronoField.DAY_OF_MONTH, 14); // setando data atual
        System.out.println(now); // printando data
        System.out.println(now.getDayOfWeek()); // printando dia da semana


        // metodos uteis
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY)); // mostra proxima data que será tal dia
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)); // mostra qual data foi o ultimo dia informado
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); // mostrar primeiro dia do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); // mostrar ultimo dia do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
