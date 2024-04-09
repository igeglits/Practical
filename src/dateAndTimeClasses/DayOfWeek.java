package dateAndTimeClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DayOfWeek {
    public static void main(String[] args) {
        java.time.DayOfWeek dow = java.time.DayOfWeek.MONDAY;
        System.out.println(dow);
        System.out.println(dow.getValue());
        System.out.println(dow.plus(3));
        System.out.println(dow.minus(3));
        System.out.println(dow.compareTo(java.time.DayOfWeek.WEDNESDAY));
        System.out.println(dow.name());
        System.out.println(dow.ordinal());

        LocalDate ld = LocalDate.of(2020, 1, 1);
        LocalDateTime ldt = LocalDateTime.of(2020, 1, 1, 15, 30);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getMonth().getValue());

        LocalTime lt = LocalTime.of(15, 30);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
    }
}
