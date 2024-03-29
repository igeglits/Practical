package dateAndTimeClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDataEx {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
class Ex2{
    public static void main(String[] args) {
        LocalDate id = LocalDate.of(2020, 1, 1);
        System.out.println(id);
        LocalDate id2 = LocalDate.of(2014, Month.APRIL, 15);
        System.out.println(id2);
    }
}
