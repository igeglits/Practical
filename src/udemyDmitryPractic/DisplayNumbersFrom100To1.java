package udemyDmitryPractic;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        var from = 100;
        var to = 1;
        var step = 1;
        for (var i = from; i >= to; i -= step) {
            System.out.print(i+" ");
        }
        System.out.println();
        {
            int i = 100;
            while (i >= 1) {
                System.out.print(i-- + " ");
            }
            System.out.println();
        }
            {
                int i = 100;
                do {
                    System.out.print(i-- + " ");
                } while (i >= 1);
            }

    }
}