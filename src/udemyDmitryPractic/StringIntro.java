package udemyDmitryPractic;

import java.util.Arrays;

public class StringIntro {
    public static void main(String[] args) {
        var s1 = "hello";
        System.out.println(s1);
        System.out.println("hello");
        //строку можно рассматривать как массив символов.
        char [] array = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(array));
    }
}
