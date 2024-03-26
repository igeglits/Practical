package UdemyDmitryPractic;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                continue;//оператор пропускает текущую итерацию цикла, 3-6 не отображаются в консоли
            }
            System.out.print(i + " ");
        }
        System.out.println();
        //без continue, его вообще лучше не использовать
        for (int i = 0; i < 10; i++) {
            if (i < 3 || i > 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
