package dateAndTimeClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeOverloaded {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020, 1, 1);
        LocalTime lt = LocalTime.of(15, 30);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);
    }
}
