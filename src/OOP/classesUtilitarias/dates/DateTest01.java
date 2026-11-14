package OOP.classesUtilitarias.dates;

import java.util.Date;

public class DateTest01 {
    static void main(String[] args) {
        Date date = new Date(1794516343391L); // Long com os milisegundos
        date.setTime(date.getTime() + 3_600_000); // metodo para adicionar horas ao horario atual

        System.out.println(date.getTime()); // metodo para saber a data e hora do dia atual
        System.out.println(date);
    }
}
