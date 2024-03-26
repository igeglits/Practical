package UdemyDmitryPractic;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                var res = i * j;
                System.out.println(i  + " * " + j + " = " + res);
            }
            System.out.println();
        }
    }
}
