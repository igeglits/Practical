package UdemyDmitryPractic;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        while (true) {

            var number = new Random().nextInt(10);
            //System.out.println(number);
            System.out.println("Enter number 0-9:");
            var guess = new Scanner(System.in).nextInt();
            if (guess == number) {
                System.out.println("Congratulations, you guessed the number! " + number);
            } else if (guess == 10) {
                break;
            } else if (guess < 0 || guess >= 11) {
                System.out.println("Sorry, but your number is invalid! Try again later...");
            } else if (guess > number) {
                System.out.println("Твое число больше, пробуй еще раз:");
            } else if (guess < number) {
                System.out.println("Твое число меньше, пробуй еще раз: ");
            }
            //второй вариант

            /*String result;
            if (guess == number) {
                result = "Congratulations, you guessed the number!";
            } else {
                result = "Sorry, but your number is invalid! Try again later...";
            }
            System.out.println(result);

            // третий вариант
            System.out.println(guess == number ? "Congratulations, you guessed the number!" : "Sorry, but your number is invalid! Try again later...");
            // или
            String result2 = guess == number ?
                    "Congratulations, you guessed the number!" :
                    "Sorry, but your number is invalid! Try again later...";
            System.out.println(result2);*/
        }
        System.out.println("end");
    }

}
