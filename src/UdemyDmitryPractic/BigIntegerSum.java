package UdemyDmitryPractic;

import java.math.BigInteger;

/*
Реализовать программу BigIntegerSum, которая умеет складывать большие числа. Например:

a = 123456789012345678901234567890123456789012345678901234567890
b = 12345678901234567890123456789012345678901234567890
a + b = 123456789024691357802469135780246913578024691357802469135780
//-------------------------------------------------------------------
a = 1
b = 999999999999999999999999999999999999999999999999999999999999
a + b = 1000000000000000000000000000000000000000000000000000000000000
//-------------------------------------------------------------------
a = 9876543210987654321098765432109876543210987654321
b = 1111111111111111111111111111111111111111111111111
a + b = 10987654322098765432209876543220987654322098765432
Подсказка: так как значения данных больших чисел не помещается в примитивные типы данных, то для хранения чисел нужно использовать строки.
При суммировании нужно брать цифры в последних разрядах и складывать между собой.
 */
public class BigIntegerSum {
    public static void main(String[] args) {
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";
        var a1 = a.length() >= b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        var b1 = a.length() <= b.length() ? b : "0".repeat(a.length() - b.length()) + b;
        System.out.println(a1);
        System.out.println(b1);

        StringBuilder result = new StringBuilder();
        int prevDigit = 0;
        for (int i = a1.length() - 1; i >= 0; i--) {
            var digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));
            int sum = digit1 + digit2 + prevDigit;
            if (sum > 9) {//сложение в столбик, перенос регистра 1 или 0 на следующую пару чисел.
                prevDigit = 1;
                sum = sum % 10;
            } else {
                prevDigit = 0;
            }
            result.insert(0, sum);
        }
        if (prevDigit != 0) {//в конце после цикла проверяем есть ли регистр не использованный !=0 и ставим его в нулевой индекс в результат
            result.insert(0, prevDigit);
        }
        System.out.println(result.toString());

        //сравним результат сложения с результатом через готовый метод в Джава
        System.out.println(new BigInteger(a).add(new BigInteger(b)));

        //минус
        System.out.println("вычитание " + new BigInteger(a).subtract(new BigInteger(b)));
//умножение
        System.out.println("умножение " + new BigInteger(a).multiply(new BigInteger(b)));
//деление
        System.out.println("деление " + new BigInteger(a).divide(new BigInteger(b)));
    }
}
/* Способ другой. Не создает дополнительных строк, а сразу оперирует с числами, бережет память.
public class BigIntegerSum2 {

    public static void main(String[] args) {
        // read source data
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";

        // processing
        StringBuilder result = new StringBuilder();
        int firstLength = a.length();
        int secondLength = b.length();
        var maxLength = firstLength > secondLength ? firstLength : secondLength;

        int prevDigit = 0;
        for (int i = 0; i < maxLength; i++) { //проверка  по индексам к максимальной длине
            int digit1;
            if (firstLength - i - 1 >= 0) {
                digit1 = Integer.parseInt(String.valueOf(a.charAt(firstLength - i - 1)));
            } else {
                digit1 = 0;
            }

            int digit2;
            if (secondLength - i - 1 >= 0) {
                digit2 = Integer.parseInt(String.valueOf(b.charAt(secondLength - i - 1)));
            } else {
                digit2 = 0;
            }

            int sum = prevDigit + digit1 + digit2;
            if (sum > 9) {
                prevDigit = 1;
                sum = sum % 10;
            } else {
                prevDigit = 0;
            }
            result.insert(0, sum);
        }
        if (prevDigit != 0) {
            result.insert(0, prevDigit);
        }

        // display results
        System.out.println("a + b = " + result);
        System.out.println("a + b = " + new BigInteger(a).add(new BigInteger(b)));
    }
}
 */
