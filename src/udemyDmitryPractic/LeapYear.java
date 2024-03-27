package udemyDmitryPractic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Введи год");
        var year = new Scanner(System.in).nextInt();
        String result;
        if (year % 400 == 0 || year % 4 == 0) {
            result = "Високосный год";
        } else if (year % 100 == 0) {
            result = "Невисокосный год";
        } else {
            result = "Невисокосный год";
        }
        System.out.println(result);
        //вариант препода
        // read source data
        var i = 2020;

        // processing
        boolean isLeap;
        if (i % 400 == 0) {
            isLeap = true;
        } else if (i % 100 == 0) {
            isLeap = false;
        } else if (i % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        // processing 2
        if ((i % 400 == 0) || ((i % 100 != 0 && (i % 4 == 0)))) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        // processing 3
        isLeap = (i % 400 == 0) || ((i % 100 != 0 && (i % 4 == 0)));

        // display results
        System.out.println(isLeap ? i + " is leap i" : i + " is not leap i");
    }
}

