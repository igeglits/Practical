package UdemyDmitryPractic;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};
        var min = array[0];
        var max = array[0];
        var minI = 0;
        var maxI = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minI = i;
            }
            if (max < array[i]) {
                max = array[i];
                maxI = i;
            }
        }
        //System.out.println(min + "\n"+minI+"\n"+max+"\n"+maxI+"\n");
        var temp = array[minI];
        array[minI] = array[maxI];
        array[maxI] = temp;
        System.out.println(Arrays.toString(array));
    }
}
