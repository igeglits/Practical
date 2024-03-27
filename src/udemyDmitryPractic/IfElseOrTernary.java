package udemyDmitryPractic;

import java.util.Scanner;

public class IfElseOrTernary {
    public static void main(String[] args) {
        System.out.println("WeekDay file");
        var day = new Scanner(System.in).nextInt();
        {
            System.out.println(day == 1 ? "Monday" :
                    day == 2 ? "Tuesday" :
                            day == 3 ? "Wednesday" :
                                    day == 4 ? "Thuesday" :
                                            day == 5 ? "Friday" :
                                                    day == 6 ? "Saturday" :
                                                            day == 7 ? "Sunday" : "Invalid day " + day);
        }

        {
            System.out.println("UniversalWeekDay");
            var isMondayFirst = true;

            System.out.println(
                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 1 ? "Monday" :
                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 2 ? "Tuesday" :
                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 3 ? "Wednesday" :
                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 4 ? "Thursday" :
                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 5 ? "Friday" :
                                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 6 ? "Saturday" :
                                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 7 ? "Sunday" :
                                                                            "Invalid day: " + day);
            //этот вариант выполнения не читаемый по сравнению с иф и элс
        }
    }
}
