package dateAndTimeClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseMethod {
    public static void main(String[] args) {
        String date = "01 10 2020";
        var parsedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM dd yyyy"));
        System.out.println(parsedDate);
        //если дата введена в стандартном формате в стринг, то можно не указывать формат паттерна.

        String time = "15:30";
        var parsedTime = LocalTime.parse(time);
        System.out.println(parsedTime);

        String dateTime = "2020-01-01T15:30";
        var parsedDateTime = LocalDateTime.parse(dateTime);
        System.out.println(parsedDateTime);
    }
}
