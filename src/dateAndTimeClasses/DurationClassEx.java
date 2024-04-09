package dateAndTimeClasses;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

class DurationClassEx {
    public static void main(String[] args) {
        Duration d = Duration.ofDays(1);
        System.out.println(d);
        Duration d2 = Duration.ofHours(2);
        System.out.println(d2);
        Duration d3 = Duration.ofMinutes(30);
        System.out.println(d3);
        Duration d4 = Duration.ofSeconds(45);
        System.out.println(d4);

        LocalTime lt = LocalTime.of(15, 30);
        System.out.println(lt);
        LocalTime lt2 = lt.plus(d2);
        System.out.println(lt2);

        LocalDateTime ldt = LocalDateTime.of(2020, 1, 1, 15, 30);
        System.out.println(ldt);
        LocalDateTime ldt2 = ldt.plus(d2);
        System.out.println(ldt2);
    }
}
