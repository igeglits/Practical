package Epam.Arrays;

import java.util.Arrays;

class LocalMaximaRemove {
    public static int[] removeLocalMaxima(int[] array) {

        int[] result = new int[array.length];
        int count = 0;
        if (array[0] <= array[1]) {
            result[count++] = array[0];
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= array[i - 1] ||array[i] <= array[i + 1]) {
                result[count++] = array[i];
            }
        }
        if (array[array.length - 1] <= array[array.length - 2]) {
            result[count++] = array[array.length - 1];
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] array = {5, 5, 5, 5, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeLocalMaxima(array)));

    }
}