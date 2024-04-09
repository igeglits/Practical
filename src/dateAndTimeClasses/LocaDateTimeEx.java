package dateAndTimeClasses;

import java.time.LocalDateTime;
import java.time.Month;

public class LocaDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2020, 1, 1, 15, 30);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2020, 1, 1, 15, 30, 45);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(2020, Month.JANUARY, 1, 15, 30, 45, 10000000);
        System.out.println(ldt3);
    }
}
