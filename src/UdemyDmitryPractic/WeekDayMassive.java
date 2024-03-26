package UdemyDmitryPractic;

import java.util.Scanner;

public class WeekDayMassive {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            var day = new Scanner(System.in).nextInt();

            String[] days = {"Monday", "Tuesday", "Wedneday", "Thursday", "Friday", "Saturday", "Sunday"};
            var result = day >= 1 && day <= 7 ? days[day - 1] : "invalid day: " + day;

            System.out.println(result);
        }
    }
}
