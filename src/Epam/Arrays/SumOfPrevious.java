package Epam.Arrays;

class SumOfPrevious {
    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        result[0] = false;
        result[1] = false;
        for (int i = 2; i < array.length; i++) {
            if (array[i - 2] + array[i - 1] == array[i]) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        return result;
    }
}
