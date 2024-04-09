package dateAndTimeClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterEx {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2020, 1, 1, 15, 30);
        LocalDate ld = LocalDate.of(2020, 1, 1);
        LocalTime lt = LocalTime.of(15, 30);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");// 2020/01/01 15:30:00//
        System.out.println(ldt.format(dtf));
        System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println("год, номер недели, день недели" +ld.format(dtf2));
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ldt.format(shortFormat));
        DateTimeFormatter shortFormatTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(lt.format(shortFormatTime));
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(lt.format(mediumFormat));
        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
       // System.out.println(lt.format(fullFormat));
        DateTimeFormatter fullFormatDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(ldt.format(fullFormatDateTime));

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime.format(fullFormatDateTime));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy h:mm:ss ww");
        System.out.println(currentDateTime.format(f));
    }
}
