package UdemyDmitryPractic;

import java.math.BigInteger;

// объявляем класс BigIntegerSum
public class BigNumbersString {
    // объявляем метод main, который запускается при выполнении программы
    public static void main(String[] args) {
        // читаем исходные данные
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";

        // обрабатываем данные
        // если длина a больше или равна длине b, то оставляем a без изменений, иначе добавляем нули в начало a, чтобы выровнять длины
        var a1 = a.length() >= b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        // если длина b больше или равна длине a, то оставляем b без изменений, иначе добавляем нули в начало b, чтобы выровнять длины
        var b1 = b.length() >= a.length() ? b : "0".repeat(a.length() - b.length()) + b;

        // создаем объект StringBuilder для хранения результата
        StringBuilder res = new StringBuilder();
        // создаем переменную prevDigit для хранения переноса
        int prevDigit = 0;
        // проходим по символам строк a1 и b1 с конца в начало
        for (int i = a1.length() - 1; i >= 0; i--) {
            // преобразуем символы в цифры
            var digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));
            // вычисляем сумму цифр и переноса
            int sum = digit1 + digit2 + prevDigit;
            // если сумма больше 9, то устанавливаем перенос в 1 и берем остаток от деления на 10
            if (sum > 9) {
                prevDigit = 1;
                sum = sum % 10;
            } else {
                // иначе перенос равен 0
                prevDigit = 0;
            }
            // добавляем полученную цифру в начало результата
            res.insert(0, sum);
        }
        // если перенос не равен 0, то добавляем его в начало результата
        if (prevDigit != 0) {
            res.insert(0, prevDigit);
        }

        // выводим результат
        System.out.println(res.toString());
        // выводим результат с помощью класса BigInteger для проверки
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
    }
}
