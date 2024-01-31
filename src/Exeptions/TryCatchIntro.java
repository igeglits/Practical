package Exeptions;

import java.util.Arrays;

class TryCatchIntro {
    public static void main(String[] args) {
        int [] array1 = {4, 8, 1};
        System.out.println(Arrays.toString(array1));
        try {
            System.out.println(array1[5]);
            System.out.println("сообщение уже не будет выводиться");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Был пойман exeption " + e);
        } finally {System.out.println("Good Day");
        }
    }
}
