package UdemyDmitryPractic;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        var name = new Scanner(System.in).nextLine();
        System.out.println("Hello " + name);
    }
}
