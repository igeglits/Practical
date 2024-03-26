package UdemyDmitryPractic;

import java.util.Scanner;

public class StringCompareTo {
    public static void main(String[] args) {
        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();
        if (s1.compareTo(s2) > 0) {//если мы хотим убедиться, что с1 больше с2, то тогда компилятор должен вернуть - больше 0
            System.out.println("s1>s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1<s2");
        } else {

            System.out.println("s1=s2");
        }

        //сравнение происходит по первому символу, если по алфавиту в с1 первый символ раньше, чем у с2, то с1 меньше.
        //сравнение по длине строк не происходит.
        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}