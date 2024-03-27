package udemyDmitryPractic;

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
        //четвертый базовый метод - возвращает индекс первого вхождения символа в строке
        System.out.println("s.indexOf('l') " + s.indexOf('l'));
        //пятый базовый метод - возвращает индекс последнего вхождения символа в строке
        System.out.println("s.lastIndexOf('l') " + s.lastIndexOf('l'));
        //шестой базовый метод - возвращает подстроку начиная с индекса
        System.out.println("s.substring(1) " + s.substring(1));
        //седьмой базовый метод - возвращает подстроку начиная с индекса и заканчивая индексом
        System.out.println("s.substring(1, 3) " + s.substring(1, 3));
        //восьмой базовый метод - заменяет символы в строке
        System.out.println("s.replace('l', 'L') " + s.replace('l', 'L'));
        //девятый базовый метод - удаляет пробелы в начале и конце строки
        System.out.println("s.trim() " + "  hello  ".trim());
        //десятый базовый метод - разбивает строку на массив строк по разделителю
        System.out.println("s.split('e') " + Arrays.toString(s.split("e")));
        //одиннадцатый базовый метод - проверяет начинается ли строка с указанной строки
        System.out.println("s.startsWith(\"he\") " + s.startsWith("he"));
        //двенадцатый базовый метод - проверяет заканчивается ли строка с указанной строки
        System.out.println("s.endsWith(\"lo\") " + s.endsWith("lo"));
        //тринадцатый базовый метод - проверяет равны ли строки
        System.out.println("s.equals(\"hello\") " + s.equals("hello"));
        //четырнадцатый базовый метод - проверяет равны ли строки без учета регистра
        System.out.println("s.equalsIgnoreCase(\"HELLO\") " + s.equalsIgnoreCase("HELLO")); //true
        //пятнадцатый базовый метод - преобразует строку в верхний регистр
        System.out.println("s.toUpperCase() " + s.toUpperCase());
        //шестнадцатый базовый метод - преобразует строку в нижний регистр
        System.out.println("s.toLowerCase() " + s.toLowerCase());
        //семнадцатый базовый метод - проверяет пустая ли строка
        System.out.println("s.isEmpty() " + s.isEmpty());
        //восемнадцатый базовый метод - проверяет равны ли строки с учетом регистра

        int i=2;
        String s1 = new String[]{"a","b","c","d","e","f","g","h","i","j"}[i];
        System.out.println("s1 " + s1);
    }
}
