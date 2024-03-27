package udemyDmitryPractic;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {

        String result = null;
        System.out.println("Enter cmd: {pi, e, exit or quit}");
        while (true) {
            var enter = new Scanner(System.in).nextLine();
            if ("pi".equals(enter)) {
                result = "3.141592653589793";
            } else if ("e".equals(enter)) {
                result = "2.718281828459045";
            } else if ("exit".equals(enter) || "quit".equals(enter)) {
                break;
            } else {
                result = "Invalid cmd. Try again!";
            }
            System.out.println(result);
        }
    }
}
