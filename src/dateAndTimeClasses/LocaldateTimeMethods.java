package dateAndTimeClasses;

import java.time.LocalDateTime;

public class LocaldateTimeMethods {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = ldt.withYear(2020);
        System.out.println(ldt2);
        LocalDateTime ldt3 = ldt.withMonth(5);
        System.out.println(ldt3);
        LocalDateTime ldt4 = ldt.withDayOfMonth(15);
        System.out.println(ldt4);
        LocalDateTime ldt5 = ldt.withHour(10);
        System.out.println(ldt5);
        LocalDateTime ldt6 = ldt.withMinute(20);
        System.out.println(ldt6);
        LocalDateTime ldt7 = ldt.withSecond(30);
        System.out.println(ldt7);
        LocalDateTime ldt8 = ldt.withNano(10000000);
        System.out.println(ldt8);
        LocalDateTime ldt9 = ldt.withDayOfYear(100);
        System.out.println(ldt9);
        LocalDateTime ldt10 = ldt.with(LocalDateTime.now());
        System.out.println(ldt10);
        LocalDateTime ldt11 = ldt.with(LocalDateTime.now().plusDays(5));
        System.out.println(ldt11);
        LocalDateTime ldt12 = ldt.with(LocalDateTime.now().minusDays(5));
        System.out.println(ldt12);
        LocalDateTime ldt13 = ldt.with(LocalDateTime.now().minusHours(5));
        System.out.println(ldt13);
        LocalDateTime ldt14 = ldt.with(LocalDateTime.now().minusMinutes(5));
        System.out.println(ldt14);
        LocalDateTime ldt15 = ldt.with(LocalDateTime.now().minusSeconds(5));
        System.out.println(ldt15);
        LocalDateTime ldt16 = ldt.with(LocalDateTime.now().minusNanos(10000000));
        System.out.println(ldt16);
        LocalDateTime ldt17 = ldt.with(LocalDateTime.now().plusHours(5));
        System.out.println(ldt17);
        LocalDateTime ldt18 = ldt.with(LocalDateTime.now().plusMinutes(5));
        System.out.println(ldt18);
        LocalDateTime ldt19 = ldt.with(LocalDateTime.now().plusSeconds(5));
        System.out.println(ldt19);
        LocalDateTime ldt20 = ldt.with(LocalDateTime.now().plusNanos(10000000));
        System.out.println(ldt20);

    }
}
