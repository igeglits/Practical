package UdemyDmitryPractic;

public class BrakeOperator {
    public static void main(String[] args) {
        //неверное использование break
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }//верное использование без break
            for (int a = 0; a < 5; a++) {
                System.out.print(a + " ");

            }
            System.out.println();
        }
    }
}