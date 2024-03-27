package udemyDmitryPractic;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Enter number of the day:");
        var a = new Scanner(System.in).nextInt();

        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thurday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saterday");
        } else if (a == 7) {
            System.out.println("Sunday");
        } else{
            System.out.println("unsupported number" + a);
        }

    }
}

