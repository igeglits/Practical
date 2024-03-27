package udemyDmitryPractic;

public class WhatIsFunction {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;
        var sum = 0;
        sum = getSum(array, element, sum);
        System.out.println(sum / element);

        var count = 0;
        count = getCount(array, element, count);
        System.out.println(count);
    }

    private static int getCount(int[] array, int element, int count) {
        for (int i : array) {
            if (i == element) {
                count++;//включает счетчик
            }
        }
        return count;
    }

    private static int getSum(int[] array, int element, int sum) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                sum += element;//считает сумму из элементов
            }
        }
        return sum;
    }
}
