package udemyDmitryPractic;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        var from = 0;
        var to = 50;
        var step = 2;
        for (var a = from; a <= to; a += step) {
            System.out.println(a);
        }
        {
            int i = 0;
            while (i <= 50) {
                System.out.print(i + " ");
                i += 2;
            }
            System.out.println();
        }
        {
            int i = 0;
            do {
                System.out.print(i + " ");
                i += 2;
            }
            while (i <= 50);
        }
    }
}

