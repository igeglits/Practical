package UdemyDmitryPractic;

import java.util.Arrays;


class PrintArrayElementsMoreThanAvg {
    public static void main(String[] args) {


        int[] array = {1, 4, -5, -2, 0, 12, 5, -9, 9, 16};
        int average = calculateAverage(array);
        System.out.println(average);
        int[] moreThanAverage = findMoreThanAverage(array, average);
        Arrays.sort(moreThanAverage);
        var min = Arrays.stream(moreThanAverage).min();
        var max = Arrays.stream(moreThanAverage).max();
        System.out.println(Arrays.toString(moreThanAverage));
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
    }

    private static int[] findMoreThanAverage(int[] array, int average) {
        int[] moreThanAverage = new int [array.length];
        int count= 0;
        for (int element : array) {
            if (element > average) {
                moreThanAverage[count] = element;
                count++;
            }
        }
        return trimArray(moreThanAverage, count);
    }
    private static int[] trimArray(int[] array, int count) {
        return  Arrays.stream(array, 0, count).toArray();
    }

    private static int calculateAverage(int[] array) {
        return (int) Arrays.stream(array).average().orElse(-1000);
    }

}
