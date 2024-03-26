package UdemyDmitryPractic;

public class DisplayNumbersFrom1To100UsingTableFormat {
    public static void main(String[] args) {
        var from = 1;
        var to = 100;
        var cols = 10;
        for (var i = from; i <= to; i++) {
            System.out.print(i + "\t ");
            if (i % cols == 0) {
                System.out.println();
            }
        }
    }
}
