package udemyDmitryPractic;


import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println("Insert number:");
        var number = new Scanner(System.in).nextInt();
        var result = 0;
        var temp = number;
        while (temp != 0) {
            var digit = temp % 10;//извлекаем остаток
            result = result * 10 + digit;
            temp /= 10;//temp=temp/10
        }
        System.out.println("Reverse number" + result);
    }
}

