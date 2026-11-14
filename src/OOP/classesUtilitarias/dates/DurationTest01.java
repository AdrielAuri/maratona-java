package OOP.classesUtilitarias.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
    }
}
