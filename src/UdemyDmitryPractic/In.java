package UdemyDmitryPractic;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        System.out.println(a);

        var ch = new Scanner(System.in).nextLine().charAt(0);
        System.out.println(ch);

        var s = new Scanner(System.in).nextLine();
        System.out.println(s);

        System.out.println("enter text");
        System.out.println(new Scanner(System.in).nextLine());

    }
}
