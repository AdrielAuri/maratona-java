package OOP.classesUtilitarias.dates;

import java.time.LocalTime;

public class LocalTimeTest01 {
    static void main(String[] args) {
        LocalTime time = LocalTime.of(22, 05, 50);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }
}
