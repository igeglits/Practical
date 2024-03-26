package UdemyDmitryPractic;

import java.util.Arrays;

public class StringBasicMethods {
    public static void main(String[] args) {
        String s = "hello";
        //первый базовый метод - Возврат длинны строки.
        System.out.println("s.length() " + s.length());
        //второй - возвращает символ по индексу.
        System.out.println("s.charAt(0) " + s.charAt(0));
        //третий базовый метод  - преобразовывает строку в массив символов
        System.out.println("s.toCharArray() " + Arrays.toString(s.toCharArray()));
    }
}
