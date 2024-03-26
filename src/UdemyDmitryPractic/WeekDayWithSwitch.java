package UdemyDmitryPractic;

import java.util.Scanner;

public class WeekDayWithSwitch {
    public static void main(String[] args) {
        System.out.println("Insert the date number");
        var a = new Scanner(System.in).nextInt();
        switch (a) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("default");
            }
        }
        System.out.println("Insert day number");
        int day = new Scanner(System.in).nextInt();
        String result;
        switch (day) {
            case 1: {
                result = "Monday";
                break;
            }
            case 2: {
                result = "Tuesday";
                break;
            }
            case 3: {
                result = "Wednesday";
                break;
            }
            case 4: {
                result = "Thursday";
                break;
            }
            case 5: {
                result = "Friday";
                break;
            }
            case 6: {
                result = "Saturday";
                break;
            }
            case 7: {
                result = "Sunday";
                break;
            }
            default: {
                result = "Invalid day: " + day;
            }
        }

        // display results
        System.out.println(result);
    }
}

