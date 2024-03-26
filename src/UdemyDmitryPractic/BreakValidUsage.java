package UdemyDmitryPractic;

import java.util.Random;
import java.util.Scanner;

public class BreakValidUsage {
    public static void main(String[] args) {
        //Invalid
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();
        // Valid
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Valid usage
        // 1. Infinite loop
        // 2.
        var number = new Random().nextInt(10);

        var guessed = false;
        for (int i = 0; i < 10; i++) {
            var userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("number > " + userCase + ". Try again: ");
            } else if (number < userCase) {
                System.out.println("number < " + userCase + ". Try again: ");
            } else {
                guessed = true;
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
        if (!guessed) {
            System.out.println("Limit reached");
        }
    }
}
