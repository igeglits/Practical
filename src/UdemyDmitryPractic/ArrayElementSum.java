package UdemyDmitryPractic;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < source.length; i++) {
            sum = source[i] + sum;
        }
        System.out.println(sum);

        int[] array = {1, 2, 3, 4, 5};
        var summa = 0;
        for (int value : array) {
            summa += value;
        }
        System.out.println(summa);
    }
}