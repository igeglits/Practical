package udemyDmitryPractic;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        var to = 9;
        var columns = 4;

        for (int r = 2; r < to; r += columns) {
            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + columns && j <= to; j++) {
                    var res = i * j;
                    System.out.print(j + " * " + i + " = " + res + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

