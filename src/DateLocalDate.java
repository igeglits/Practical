import java.time.LocalDate;

public class DateLocalDate {
    public static void main(String[] args) {
        // Создаем объект LocalDate
        LocalDate date;
        date = (LocalDate.now().plusDays(1));
        // Выводим текущую дату
        System.out.println(date);
    }
}
