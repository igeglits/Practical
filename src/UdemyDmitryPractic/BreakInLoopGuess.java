package UdemyDmitryPractic;

import java.util.Random;
import java.util.Scanner;

public class BreakInLoopGuess {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

        var guessed = false;
        for (int i = 0; i < 10; i++) {
            var userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("number > " + userCase + ". Try again: ");
            } else if (number < userCase) {
                System.out.println("number < " + userCase + ". Try again: ");
            } else {
                guessed = true;//угадано, переменная получает тру.
                System.out.println("Congratulations, you guessed the number!");
                break;//оператор использован корректно, без привязки к условиям цикла.
            }
        }//уже после выполнения цикла выйдет сообщение о достижении лимита
        if (!guessed) {// если не угадано
            System.out.println("Limit reached");
        }
    }
}
