package UdemyDmitryPractic;

import java.util.Scanner;

public class UniversalWeekDay {
    public static void main(String[] args) {
        System.out.println("Monday is the first day of the week - true/false:");

        var isMondayFirst = new Scanner(System.in).nextBoolean();
        System.out.println("Enter number of the day:");
        var day = new Scanner(System.in).nextInt();

        if (!isMondayFirst) {
            day--;
            if (day == 0) {
                day = 7;
            }//это не понятно
        }
            String result;
            if (day == 1) {
                result = "Monday";
            } else if (day == 2) {
                result = "Tuesday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 4) {
                result = "Thursday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 6) {
                result = "Saturday";
            } else if (day == 7) {
                result = "Sunday";
            } else {
                result = "Invalid day: " + day;
            }
            System.out.println(result);

        }

    }



