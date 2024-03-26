package UdemyDmitryPractic;

import java.util.Arrays;

public class ArrayLenght {
    public static void main(String[] args) {
        int[] array = {8, 2, 67};
        System.out.println(Arrays.toString(array));

        System.out.println(array.length);

        System.out.println(array[array.length - 1]);//всегда отображает последний элемент массива
    }
}
