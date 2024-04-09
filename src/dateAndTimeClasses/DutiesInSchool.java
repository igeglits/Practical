package dateAndTimeClasses;

import java.time.LocalDate;
import java.time.Period;

class DutiesInSchool {

    static void changeDuty(LocalDate start, LocalDate end) {
        LocalDate data = start;
        while(data.isBefore(end)) {
            System.out.println("Duty to be changed on: " + data);
            data = data.plusMonths(1);
        }

    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 9, 1);
        LocalDate end = LocalDate.of(2021, 5, 31);
        changeDuty(start, end);
    }
}
class DutiesInSchoolWithPeriod{
    static void changeDuty(LocalDate start, LocalDate end, Period period) {
        // Period будет работать только с LocalDate
        // метод chaining с Period работать не будет, сработает только последнее звено цепочки
        //нужно создавать каждое звено цепочки отдельно
        LocalDate data = start;
        while(data.isBefore(end)) {
            System.out.println("Duty to be changed on: " + data);
            data = data.plus(period);
        }

    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 9, 1);
        LocalDate end = LocalDate.of(2022, 5, 31);
        changeDuty(start, end, Period.ofWeeks(2));
        System.out.println("============Period.of()========================");
        changeDuty(start, end, Period.of(1,2,3));
    }
}

