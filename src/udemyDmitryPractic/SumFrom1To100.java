package udemyDmitryPractic;

public class SumFrom1To100 {
    public static void main(String[] args) {
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
