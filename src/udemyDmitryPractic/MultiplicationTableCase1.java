package udemyDmitryPractic;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                var res = i * j;
                System.out.print((res == 1 ? " " : res) + "\t");
            }
            System.out.println();
        }
    }
}
