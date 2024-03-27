package udemyDmitryPractic;

import java.util.Arrays;

public class StringNewStringMethods {
    public static void main(String[] args) {
        String s = " Hello world! ";
        System.out.println("s.toUpperCase()=" + s.toUpperCase());//создаст новую строку на базе существующей и приводит строчный регистр в заглавные
        System.out.println("s.toLowerCase()=" + s.toLowerCase());//создаст новую строку на базе существующей и приводит заглавный регистр в строчный

        System.out.println("s.repeat(2)=" + s.repeat(2));// повторяет строку
        System.out.println("s.replace('l','j')=" + s.replace('l', 'j'));
        System.out.println("s.replace(\"Hello\", \"Bye\")=" + s.replace("Hello", "Bye"));

        //Вырежем из текущей строки подстроку начиная с какого то определенного индекса и до конца строки или определенного индекса
        System.out.println("s.substring(6)=" + s.substring(6));
        System.out.println("s.substring(0,6)=" + s.substring(0, 6));

        System.out.println(s.split(" "));// метод сплит, здесь разделяет по пробелу
        System.out.println("s.split(\" \")=" + Arrays.toString(s.split(" ")));

        System.out.println(s.trim());
        System.out.println(s.strip());// удаление начальных и конечных пробелов в строке.
        //Все методы не меняют строку изначальную, а создают новую. Переменная s здесь никогда не менялась

    }
}
