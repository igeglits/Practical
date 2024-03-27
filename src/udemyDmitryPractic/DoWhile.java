package udemyDmitryPractic;

public class DoWhile {
    public static void main(String[] args) {
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
        System.out.println();
    }//do while обязательно выполнится первый раз при ложном условии, т.к. проверка после выполнения первого цикла
}
