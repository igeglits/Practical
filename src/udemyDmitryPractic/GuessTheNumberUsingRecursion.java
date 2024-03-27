package udemyDmitryPractic;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {
        int number = new Random().nextInt(10);
       iterativeGuess(number);
        recursionGuess(number);
    }

    private static void iterativeGuess(int number) {


        while (true) {
            // read source data
            var userCase = new Scanner(System.in).nextInt();

            // processing
            if (number > userCase) {
                // display results
                System.out.println("number > " + userCase + ". Try again:");
            } else if (number < userCase) {
                // display results
                System.out.println("number < " + userCase + ". Try again:");
            } else {
                // display results
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
    }

    private static void recursionGuess(int number) {

        var userNum = new Scanner(System.in).nextInt();
        if (number>userNum) {
            System.out.println("number > " + userNum + ". Try again:");
            recursionGuess(number);
        } else if (number<userNum) {
            System.out.println("number < " + userNum + ". Try again:");
            recursionGuess(number);
        }
        else {
            System.out.println("Congratulations, you guessed the number!");
        }
    }
}
