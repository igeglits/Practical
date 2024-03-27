package udemyDmitryPractic;

public class SumFrom1To100Recursion {
    public static void main(String[] args) {
        cycle();
        System.out.println(sumOf(1, 0));
        System.out.println(sumOf(100));
    }

    private static int sumOf(int current, int sum) {
        if (current > 100) {
            return sum;
        } else {
            return sumOf(current + 1, sum + current);
        }
    }

    private static int sumOf(int value) {
        if (value == 0) {
            return 0;
        } else {
            return value + sumOf(value - 1);
        }
    }

    private static void cycle() {
        var from = 1;
        var to = 100;
        var step = 1;
        var sum = 0;
        for (int i = from; i <= to; i += step) {
            sum += i;
        }
        System.out.println(sum);
    }
}
