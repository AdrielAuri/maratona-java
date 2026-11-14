package OOP.classesUtilitarias.dates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // puxa informações sobre datas
        Date date = cal.getTime(); // data formatada
        if(cal.getFirstDayOfWeek() == Calendar.SUNDAY){ // valida se domingo é  primeiro dia da semana
            System.out.println("Domingo é o primeiro dia da semana");
        }

        // puxa as seguintes informações
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

        cal.add(Calendar.DAY_OF_MONTH, 2); // adiciona dias ao mês
        cal.add(Calendar.HOUR, 2); // adiciona horas

        System.out.println(date);

    }
}
