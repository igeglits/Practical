package UdemyDmitryPractic;

import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Arrays.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] test = {1, 5, 3, 19, 23, 89, 74, 9};
        var sorted = Arrays.stream(test).sorted().toArray();
        out.println(Arrays.toString(sorted));
        sort(test);
        out.println(Arrays.toString(test));
        out.println();
        out.println(Arrays.binarySearch(test, 19));
       var min = Arrays.stream(test).min().toString();
       var max = Arrays.stream(test).max().toString();
        out.println(min + " "+ max);
    }
}