package Epam;

class SumOfEvenNumbers {
    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;
        if (array == null) {
            return 0;
        }
        if (array.length == 0) {
            return 0;
        }
        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}

