package Epam.Arrays;

import java.util.Arrays;

class CycleSwap {
    void cycleSwap(int[] array) {
        int[] result;
        if (array.length == 0) {
           result = new int[0];
        } else {
           result = new int[array.length];
            result[0] = array[array.length - 1];
            System.arraycopy(array, 0, result, 1, array.length - 1);
        }
        System.out.println(Arrays.toString(result));
    }

    void cycleSwap(int[] array, int shift) {
        if (array.length == 0) {
            int[] result = new int[0];
        }
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(i + shift) % array.length] = array[i];
        }System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        CycleSwap cycleSwap = new CycleSwap();
        int[] array = {1, 3, 2, 7, 4};
        cycleSwap.cycleSwap(array);
        cycleSwap.cycleSwap(array, 5);

    }
}
