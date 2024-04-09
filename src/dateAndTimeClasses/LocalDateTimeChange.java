package dateAndTimeClasses;

import java.time.LocalDateTime;

public class LocalDateTimeChange {
    public static void main(String[] args) {
        //объекты локал дате тайм неизменяемые
        //поэтому при изменении объекта создается новый объект
        //с измененными значениями
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = ldt.withYear(2020).withMonth(1).withDayOfMonth(1).withHour(15).withMinute(30).withSecond(45);
        System.out.println(ldt2);
        LocalDateTime ldt3 = ldt.minusDays(180);
        System.out.println(ldt3);
        LocalDateTime ldt4 = ldt.plusWeeks(180);
        System.out.println(ldt4);

        ldt2 = ldt2.with(LocalDateTime.now());
        System.out.println(ldt2);

        ldt2 = ldt2.with(LocalDateTime.now().plusDays(5).minusHours(5).minusYears(1));
        System.out.println(ldt2);
        System.out.println("getDaysOfYear "+ldt2.getDayOfYear());
        System.out.println(ldt.isBefore(ldt4));
        System.out.println(ldt.isAfter(ldt4));
    }
}
